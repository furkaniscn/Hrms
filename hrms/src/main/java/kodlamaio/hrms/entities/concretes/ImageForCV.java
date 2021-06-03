package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv_images")
public class ImageForCV extends Base {

	@Column(name = "url")
	private String url;

	@JoinColumn(name = "jobseeker", referencedColumnName = "user_id")
	@OneToOne(optional = false, fetch = FetchType.LAZY)
	private Jobseeker jobseeker;
}
