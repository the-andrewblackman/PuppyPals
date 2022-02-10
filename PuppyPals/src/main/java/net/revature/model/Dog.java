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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApiid() {
		return apiid;
	}
	public void setApiid(String apiid) {
		this.apiid = apiid;
	}
	public int getTrainingtime() {
		return trainingtime;
	}
	public void setTrainingtime(int trainingtime) {
		this.trainingtime = trainingtime;
	}
	public String getFoodconsumption() {
		return foodconsumption;
	}
	public void setFoodconsumption(String foodconsumption) {
		this.foodconsumption = foodconsumption;
	}
	public String getExerciseroutine() {
		return exerciseroutine;
	}
	public void setExerciseroutine(String exerciseroutine) {
		this.exerciseroutine = exerciseroutine;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public int getFriendliness() {
		return friendliness;
	}
	public void setFriendliness(int friendliness) {
		this.friendliness = friendliness;
	}
	public int getAffectionlevel() {
		return affectionlevel;
	}
	public void setAffectionlevel(int affectionlevel) {
		this.affectionlevel = affectionlevel;
	}
	public int getShedding() {
		return shedding;
	}
	public void setShedding(int shedding) {
		this.shedding = shedding;
	}
	
}
