package net.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.revature.model.Kennel;

@Repository("kennelRepository")
public interface KennelRepository extends JpaRepository<Kennel, Integer>{
	
	Kennel findById(int id);
	
	List<Kennel> findAllByAccountid(int accountid);
	
	List<Kennel> findAll();
	
	void delete(Kennel kennel);
}
