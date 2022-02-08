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

import net.revature.model.Kennel;
import net.revature.service.KennelService;

@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RestController("kennelController")
@RequestMapping("/kennel")
public class KennelController {
	
	@Autowired
	private KennelService kennelService;
	
	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody Kennel kennel) {
		this.kennelService.save(kennel);
	}
	
	@GetMapping(path = "/find/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Kennel>> findById(@PathVariable int id){
		return new ResponseEntity<List<Kennel>>(this.kennelService.findById(id), HttpStatus.OK);
	}
	
	@GetMapping(path = "/findByAccount/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Kennel>> findAllByAccountid(@PathVariable int id){
		return new ResponseEntity<List<Kennel>>(this.kennelService.findAllByAccountId(id), HttpStatus.OK);
	}
	
	@GetMapping(path = "/find/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Kennel>> findAll(){
		return new ResponseEntity<List<Kennel>>(this.kennelService.findAll(), HttpStatus.OK);
	}
	
	@PostMapping(path = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody Kennel kennel) {
		this.kennelService.delete(kennel);
	}
}
