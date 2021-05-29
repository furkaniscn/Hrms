package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_adverts")
public class JobAdvert {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "description")
	private String description;

	@Column(name = "salary_max")
	private int salaryMax;

	@Column(name = "salary_min")
	private int salaryMin;

	@Column(name = "opean_position_count")
	private int openPositionCount;

	@Column(name = "deadline")
	private LocalDate deadline;

	@Column(name = "published_at")
	private LocalDate publishedAt;

	@Column(name = "created_at")
	private LocalDate createdAt;

	@Column(name = "is_active")
	private boolean isActive;

	@Column(name = "is_deleted")
	private boolean isDeleted;

	@Column(name = "is_open")
	private boolean isOpen;

	@ManyToOne
	@Column(name = "employer_id")
	private Employer employer;

	@ManyToOne
	@Column(name = "city_id")
	private City city;

	@ManyToOne
	@Column(name = "jobposition_id")
	private JobPosition jobPosition;
}
