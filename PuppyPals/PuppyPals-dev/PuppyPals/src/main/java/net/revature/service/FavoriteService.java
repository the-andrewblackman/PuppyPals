package net.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.revature.model.Favorite;
import net.revature.repository.FavoriteRepository;

@Service("favoriteService")
public class FavoriteService {
	
	@Autowired
	FavoriteRepository favoriteRepository;
	
	public void save(Favorite favorite) {
		this.favoriteRepository.save(favorite);
	}
	
	public List<Favorite> findAllByAccountid(int id){
		return this.favoriteRepository.findAllByAccountid(id);
	}
	
	public void delete(Favorite favorite) {
		this.favoriteRepository.delete(favorite);
	}
}
