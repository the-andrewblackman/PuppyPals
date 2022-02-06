package net.revature.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import net.revature.model.Account;
import net.revature.repository.AccountRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	

	@Autowired
	AccountRepository accountRepository;
	
	@Override
	 public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Account> user = accountRepository.findByUsername(username);
		
		user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));
		return user.map(MyUserDetails::new).get();
	}


}
