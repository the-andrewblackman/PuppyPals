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

@Table(name = "kennel")
@Data
public class Kennel {
	@Id
	@Column
	@GeneratedValue(generator = "kennel_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "kennel_id_seq")
	private int id;
	@Column
	private int dogid;
	@Column
	private int accountid;
	@Column
	private String dogname;
	@Column
	private int dogage;
}
