package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cv_cover_letters")
public class CoverLetterForCV extends Base {

	@Column(name = "content")
	private String content;

	@ManyToOne()
	@JsonIgnore
	@JoinColumn(name = "jobseeker_id")
	private Jobseeker jobseeker;

	public CoverLetterForCV(String content, int jobseekerId) {
		super();
		this.content = content;
		this.jobseeker.setId(jobseekerId);
	}
}
