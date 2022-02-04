package net.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.revature.model.Dog;
import net.revature.service.DogService;

@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RestController("dogController")
@RequestMapping("/dog")
public class DogController {
	
	@Autowired
	private DogService dogService;
	
	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody Dog dog) {
		this.dogService.save(dog);
	}
	
	@GetMapping(path = "/find/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Dog> findById(@PathVariable int id){
		return new ResponseEntity<Dog>(this.dogService.findById(id), HttpStatus.OK);
	}
	
	@GetMapping(path = "/find/api={apiid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Dog> findByApiid(@PathVariable String apiid){
		return new ResponseEntity<Dog>(this.dogService.findByApiid(apiid), HttpStatus.OK);
	}
	
	@GetMapping(path = "/find/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Dog>> findAll(){
		return new ResponseEntity<List<Dog>>(this.dogService.findAll(), HttpStatus.OK);
	}
	
	@PostMapping(path = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody Dog dog) {
		this.dogService.delete(dog);
	}
}
