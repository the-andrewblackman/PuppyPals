package revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import revature.model.Kennel;

@Repository("kennelRepository")
public interface KennelRepository extends JpaRepository<Kennel, Integer>{

	<S extends Kennel> S save(Kennel kennel);
	
	Kennel findById(int id);
	
	List<Kennel> findAllByAccountId(int account_id);
	
	List<Kennel> findAll();
	
	void delete(Kennel kennel);
}
