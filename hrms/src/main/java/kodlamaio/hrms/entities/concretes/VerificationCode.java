package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "verification_codes")
public class VerificationCode extends Base {

	@Column(name = "user_id")
	private int userId;

	@Column(name = "code")
	private String code;

	@Column(name = "is_confirmed")
	private boolean isConfirmed;

}
