package net.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.revature.model.Dog;
import net.revature.repository.DogRepository;

@Service("dogService")
public class DogService {
	
	@Autowired
	private DogRepository dogRepository;
	
	void save(Dog dog) {
		this.dogRepository.save(dog);
	}
	
	Dog findById(int id) {
		return this.dogRepository.findById(id);
	}
	
	List<Dog> findAllByApiid(int api_id){
		return this.dogRepository.findAllByApiid(api_id);
	}
	
	List<Dog> findAll(){
		return this.dogRepository.findAll();
	}
	
	void delete(Dog dog) {
		this.dogRepository.delete(dog);
	}
	
}
