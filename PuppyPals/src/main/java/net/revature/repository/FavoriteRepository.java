package net.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.revature.model.Favorite;

@Repository("favoriteRepository")
public interface FavoriteRepository extends JpaRepository<Favorite, Integer>{
	
	List<Favorite> findAllByAccountid(int id);
	
	void delete(Favorite favorite);
}
