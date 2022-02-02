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

import net.revature.model.Favorite;
import net.revature.service.FavoriteService;

@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RestController("favoriteController")
@RequestMapping("/favorite")
public class FavoriteController {
	
	@Autowired
	FavoriteService favoriteService;
	
	@PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody Favorite favorite) {
		this.favoriteService.save(favorite);
	}
	
	@GetMapping(path = "/findAll/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Favorite>> findAllByAccountid(@PathVariable int id){
		return new ResponseEntity<List<Favorite>>(this.favoriteService.findAllByAccountid(id), HttpStatus.OK);
	}
	
	@PostMapping(path = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody Favorite favorite) {
		this.favoriteService.delete(favorite);
	}
}
