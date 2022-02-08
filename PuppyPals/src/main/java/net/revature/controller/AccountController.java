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

import net.revature.model.Account;
import net.revature.service.AccountService;

@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RestController("accountController")
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	
	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Account>> findAll(){
		return new ResponseEntity<List<Account>>(this.accountService.findAll(), HttpStatus.OK);
	}
	
	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody Account account) {
		this.accountService.save(account);
	}
	
	@GetMapping(path = "/find/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Account> findByUsername(@PathVariable String username){
		return new ResponseEntity<Account>(this.accountService.findByUsername(username), HttpStatus.OK);
	}
	
	@GetMapping(path = "/find/id={id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Account> findById(@PathVariable int id){
		return new ResponseEntity<Account>(this.accountService.findById(id), HttpStatus.OK);
	}
	
	@PostMapping(path = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody Account account) {
		this.accountService.delete(account);
	}
	
}
