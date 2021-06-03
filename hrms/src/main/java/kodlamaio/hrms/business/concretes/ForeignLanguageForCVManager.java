package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ForeignLanguageForCVService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ForeignLanguageForCVDao;
import kodlamaio.hrms.entities.concretes.ForeignLanguageForCV;

@Service
public class ForeignLanguageForCVManager implements ForeignLanguageForCVService {

	private ForeignLanguageForCVDao foreignLanguageForCVDao;

	@Autowired
	public ForeignLanguageForCVManager(ForeignLanguageForCVDao foreignLanguageForCVDao) {
		super();
		this.foreignLanguageForCVDao = foreignLanguageForCVDao;
	}

	@Override
	public Result add(ForeignLanguageForCV foreignLanguageForCV) {
		this.foreignLanguageForCVDao.save(foreignLanguageForCV);
		return new SuccessResult("Language has been added");
	}

	@Override
	public Result delete(int id) {
		this.foreignLanguageForCVDao.deleteById(id);
		return new SuccessResult("Language has been deleted");
	}

	@Override
	public Result update(ForeignLanguageForCV foreignLanguageForCV) {
		this.foreignLanguageForCVDao.save(foreignLanguageForCV);
		return new SuccessResult("Language has been updated");
	}

	@Override
	public DataResult<ForeignLanguageForCV> getById(int id) {
		return new SuccessDataResult<ForeignLanguageForCV>
		(this.foreignLanguageForCVDao.getById(id));
	}

	@Override
	public DataResult<List<ForeignLanguageForCV>> getAll() {
		return new SuccessDataResult<List<ForeignLanguageForCV>>
		(this.foreignLanguageForCVDao.findAll());
	}

	@Override
	public DataResult<List<ForeignLanguageForCV>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<ForeignLanguageForCV>>
		(this.foreignLanguageForCVDao.getAllByJobseeker_id(id));
	}

}
