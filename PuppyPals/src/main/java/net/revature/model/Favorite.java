package net.revature.model;

import java.util.Objects;

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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public int getDogid() {
		return dogid;
	}
	public void setDogid(int dogid) {
		this.dogid = dogid;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(accountid, dogid, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Favorite other = (Favorite) obj;
		return accountid == other.accountid && dogid == other.dogid && id == other.id;
	}
	
	@Override
	public String toString() {
		return "Favorite [id=" + id + ", accountid=" + accountid + ", dogid=" + dogid + "]";
	}
	
}
