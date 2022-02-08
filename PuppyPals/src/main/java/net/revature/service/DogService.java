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
	
	public void save(Dog dog) {
		this.dogRepository.save(dog);
	}
	
	public List<Dog> findById(int id) {
		return this.dogRepository.findById(id);
	}
	
	public Dog findByApiid(String id){
		return this.dogRepository.findByApiid(id);
	}
	
	public List<Dog> findAll(){
		return this.dogRepository.findAll();
	}
	
	public void delete(Dog dog) {
		this.dogRepository.delete(dog);
	}
	
}
