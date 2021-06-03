package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CoverLetterForCV;

public interface CoverLetterForCVService {
	Result add(CoverLetterForCV coverLetterForCV);

	Result delete(int id);

	Result update(CoverLetterForCV coverLetterForCV);

	DataResult<CoverLetterForCV> getById(int id);

	DataResult<List<CoverLetterForCV>> getAll();
}
