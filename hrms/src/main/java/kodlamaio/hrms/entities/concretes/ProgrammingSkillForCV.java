package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cv_programming_skills")
public class ProgrammingSkillForCV extends Base {

	@Column(name = "skill_name")
	private String skillName;

	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private Jobseeker jobseeker;
}
