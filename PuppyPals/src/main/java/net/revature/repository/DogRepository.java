package net.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.revature.model.Dog;

@Repository("dogRepository")
public interface DogRepository extends JpaRepository<Dog, Integer>{
	<S extends Dog> S save(Dog dog);
	
	Dog findById(int id);
	
	Dog findByApiid(int apiid);
	
	List<Dog> findAll();
	
	void delete(Dog dog);
}
