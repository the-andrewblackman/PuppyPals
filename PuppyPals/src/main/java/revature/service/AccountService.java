package revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import revature.repository.AccountRepository;

@Service("accountService")
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	
	
}
