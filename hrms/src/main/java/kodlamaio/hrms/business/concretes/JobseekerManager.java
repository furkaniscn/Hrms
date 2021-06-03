package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ExperienceForCVService;
import kodlamaio.hrms.business.abstracts.ForeignLanguageForCVService;
import kodlamaio.hrms.business.abstracts.ImageForCVService;
import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.business.abstracts.LinkForCVService;
import kodlamaio.hrms.business.abstracts.ProgrammingSkillForCVService;
import kodlamaio.hrms.business.abstracts.SchoolForCVService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobseekerDao;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import kodlamaio.hrms.entities.dtos.JobseekerCVDto;

@Service
public class JobseekerManager implements JobseekerService {

	private JobseekerDao jobseekerDao;
	private LinkForCVService linkForCVService;
	private ExperienceForCVService experienceForCVService;
	private ForeignLanguageForCVService foreignLanguageForCVService;
	private ProgrammingSkillForCVService programmingSkillForCVService;
	private SchoolForCVService schoolForCVService;
	private ImageForCVService imageForCVService;

	@Autowired
	public JobseekerManager(JobseekerDao jobseekerDao, LinkForCVService linkForCVService,
			ExperienceForCVService experienceForCVService, ForeignLanguageForCVService foreignLanguageForCVService,
			ProgrammingSkillForCVService programmingSkillForCVService, SchoolForCVService schoolForCVService,
			ImageForCVService imageForCVService) {
		super();
		this.jobseekerDao = jobseekerDao;
		this.linkForCVService = linkForCVService;
		this.experienceForCVService = experienceForCVService;
		this.foreignLanguageForCVService = foreignLanguageForCVService;
		this.programmingSkillForCVService = programmingSkillForCVService;
		this.schoolForCVService = schoolForCVService;
		this.imageForCVService = imageForCVService;
	}

	@Override
	public Result add(Jobseeker jobseeker) {
		this.jobseekerDao.save(jobseeker);
		return new SuccessResult("Jobseeker has been added.");
	}

	@Override
	public DataResult<List<Jobseeker>> getAll() {
		return new SuccessDataResult<List<Jobseeker>>
		(this.jobseekerDao.findAll());
	}

	@Override
	public DataResult<Jobseeker> getJobseekerByNationalId(String nationalId) {
		return new SuccessDataResult<Jobseeker>
		(this.jobseekerDao.findJobseekerByNationalId(nationalId));
	}

	@Override
	public Result delete(int id) {
		this.jobseekerDao.deleteById(id);
		return new SuccessResult("Jobseeker has been deleted");
	}

	@Override
	public Result update(Jobseeker jobseeker) {
		this.jobseekerDao.save(jobseeker);
		return new SuccessResult("Jobseeker has been updated");
	}

	@Override
	public DataResult<Jobseeker> getById(int id) {
		return new SuccessDataResult<Jobseeker>
		(this.jobseekerDao.getById(id));
	}

	@Override
	public DataResult<JobseekerCVDto> getJobseekerCVById(int id) {
		JobseekerCVDto cv = new JobseekerCVDto();
		cv.experiences = this.experienceForCVService.getAllByJobseekerId(id).getData();
		cv.languages = this.foreignLanguageForCVService.getAllByJobseekerId(id).getData();
		cv.schools = this.schoolForCVService.getAllByJobseekerId(id).getData();
		cv.image = this.imageForCVService.getByJobseekerId(id).getData();
		cv.links = this.linkForCVService.getAllByJobseekerId(id).getData();
		cv.programingSkills = this.programmingSkillForCVService.getAllByJobseekerId(id).getData();
		return new SuccessDataResult<JobseekerCVDto>(cv);
	}

}
