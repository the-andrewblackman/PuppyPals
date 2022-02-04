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

@Table(name = "dog")
@Data
public class Dog {
	@Id
	@Column
	@GeneratedValue(generator = "dog_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "dog_id_seq")
	private int id;
	@Column
	private String apiid;
	@Column
	private int trainingtime;
	@Column
	private String foodconsumption;
	@Column
	private String exerciseroutine;
	@Column
	private int energy;
	@Column
	private int friendliness;
	@Column
	private int affectionlevel;
	@Column
	private int shedding;
}
