package revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Table(name = "kennel")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kennel {
	@Id
	@Column
	@GeneratedValue(generator = "kennel_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "kennel_id_seq")
	private int id;
	@Column
	private int dog_id;
	@Column
	private int account_id;
	@Column
	private String dog_name;
	@Column
	private int dog_age;
}
