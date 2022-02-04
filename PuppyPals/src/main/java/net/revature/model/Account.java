package net.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity

@Table(name = "account")
@Data
public class Account {
	@Id
	@Column(name="id")
	@GeneratedValue(generator = "account_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "account_id_seq", sequenceName = "account_id_seq")
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="pass")
	private String pass;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="email")
	private String email;

}
