package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import kodlamaio.hrms.entities.dtos.JobseekerCVDto;

public interface JobseekerService {

	Result add(Jobseeker jobseeker);

	Result delete(int id);

	Result update(Jobseeker jobseeker);

	DataResult<Jobseeker> getById(int id);

	DataResult<Jobseeker> getJobseekerByNationalId(String nationalId);

	DataResult<JobseekerCVDto> getJobseekerCVById(int id);

	DataResult<List<Jobseeker>> getAll();

}
