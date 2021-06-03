package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CoverLetterForCVService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CoverLetterForCVDao;
import kodlamaio.hrms.entities.concretes.CoverLetterForCV;

@Service
public class CoverLetterForCVManager implements CoverLetterForCVService {

	private CoverLetterForCVDao coverLetterForCVDao;

	@Autowired
	public CoverLetterForCVManager(CoverLetterForCVDao coverLetterForCVDao) {
		super();
		this.coverLetterForCVDao = coverLetterForCVDao;
	}

	@Override
	public Result add(CoverLetterForCV coverLetterForCV) {
		this.coverLetterForCVDao.save(coverLetterForCV);
		return new SuccessResult("Cover letter has been added");
	}

	@Override
	public Result delete(int id) {
		this.coverLetterForCVDao.deleteById(id);
		return new SuccessResult("Cover letter has been deleted");
	}

	@Override
	public Result update(CoverLetterForCV coverLetterForCV) {
		this.coverLetterForCVDao.save(coverLetterForCV);
		return new SuccessResult("Cover letter has been updated");
	}

	@Override
	public DataResult<CoverLetterForCV> getById(int id) {
		return new SuccessDataResult<CoverLetterForCV>(this.coverLetterForCVDao.getById(id));
	}

	@Override
	public DataResult<List<CoverLetterForCV>> getAll() {
		return new SuccessDataResult<List<CoverLetterForCV>>(this.coverLetterForCVDao.findAll());
	}

}
