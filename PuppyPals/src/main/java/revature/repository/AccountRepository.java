package revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import revature.model.Account;

@Repository("accountRepository")
public interface AccountRepository extends JpaRepository<Account, Integer>{
	
	<S extends Account> S save(Account account);
	
	Account findById(int id);
	
	Account findByUsername(String username);
	
	List<Account> findAll();
	
	void delete(Account account);
}
