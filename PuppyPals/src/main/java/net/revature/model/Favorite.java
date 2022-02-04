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

@Table(name = "favorite")
@Data
public class Favorite {
	
	@Id
	@Column(name="id")
	@GeneratedValue(generator = "favorite_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "favorite_id_seq", sequenceName = "favorite_id_seq")
	private int id;
	@Column
	private int accountid;
	@Column
	private int dogid;
	
}
