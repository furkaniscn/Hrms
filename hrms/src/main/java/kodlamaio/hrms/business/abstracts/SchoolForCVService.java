package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SchoolForCV;

public interface SchoolForCVService {
	Result add(SchoolForCV schollForCV);

	Result delete(int id);

	Result update(SchoolForCV schoolForCV);

	DataResult<SchoolForCV> getById(int id);

	DataResult<List<SchoolForCV>> getAllByJobseekerId(int id);

	DataResult<List<SchoolForCV>> getAll();

	DataResult<List<SchoolForCV>> getAllByJobseekerIdOrderByEndAtDesc(int id);
}
