package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.LinkForCV;

public interface LinkForCVService {
	Result add(LinkForCV linkForCV);

	Result delete(int id);

	Result update(LinkForCV linkForCV);

	DataResult<LinkForCV> getById(int id);

	DataResult<List<LinkForCV>> getAllJobseekerId(int id);

	DataResult<List<LinkForCV>> getAll();
}
