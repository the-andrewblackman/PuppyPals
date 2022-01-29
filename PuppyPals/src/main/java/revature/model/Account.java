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

@Table(name = "account")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	@Id
	@Column
	@GeneratedValue(generator = "account_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "account_id_seq")
	private int id;
	@Column
	private String username;
	@Column
	private String pass;
	@Column
	private String first_name;
	@Column
	private String last_name;
	@Column
	private String email;
}
