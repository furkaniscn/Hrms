package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CoverLetterForCV;

public interface CoverLetterForCVDao extends JpaRepository<CoverLetterForCV, Integer> {
	CoverLetterForCV getById(int id);

}
