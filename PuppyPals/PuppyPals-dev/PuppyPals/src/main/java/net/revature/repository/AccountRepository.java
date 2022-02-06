package net.revature.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.revature.model.Account;

@Repository("accountRepository")
public interface AccountRepository extends JpaRepository<Account, Integer>{
	
	<S extends Account> S save(Account account);
	
	Account findById(int id);
	
	Optional<Account> findByUsername(String username);
	
	List<Account> findAll();
	
	void delete(Account account);
	
	//<Account> findByUserName(String username);


}
