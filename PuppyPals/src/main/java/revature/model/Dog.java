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

@Table(name = "dog")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog {
	@Id
	@Column
	@GeneratedValue(generator = "dog_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "dog_id_seq")
	private int id;
	@Column
	private int api_id;
	@Column
	private int training_time;
	@Column
	private String food_consumption;
	@Column
	private String exercise_routine;
	@Column
	private int energy;
	@Column
	private int friendliness;
	@Column
	private int affection_level;
	@Column
	private int shedding;
	
}
