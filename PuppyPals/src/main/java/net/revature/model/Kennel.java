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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDogid() {
		return dogid;
	}
	public void setDogid(int dogid) {
		this.dogid = dogid;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getDogname() {
		return dogname;
	}
	public void setDogname(String dogname) {
		this.dogname = dogname;
	}
	public int getDogage() {
		return dogage;
	}
	public void setDogage(int dogage) {
		this.dogage = dogage;
	}
	
}
