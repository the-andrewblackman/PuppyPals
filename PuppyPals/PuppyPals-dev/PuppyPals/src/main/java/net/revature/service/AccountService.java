package net.revature.service;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.revature.model.Account;
import net.revature.repository.AccountRepository;

@Service("accountService")
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	public void save(Account account) {
		this.accountRepository.save(account);
	}
	
	public Account findById(int id) {
		return this.accountRepository.findById(id);
	}
	
	public Optional<Account> findByUsername(String username) {
		return this.accountRepository.findByUsername(username);
	}
	
	public List<Account> findAll(){
		return this.accountRepository.findAll();
	}
	
	public void delete(Account account) {
		this.accountRepository.delete(account);
	}
}
