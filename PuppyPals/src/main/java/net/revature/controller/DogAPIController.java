package net.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController("dogAPIController")
@RequestMapping("/api")
public class DogAPIController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private HttpEntity<Object> headers = new HttpEntity<Object>("${api.key");
	
	@GetMapping(path = "/dog/{breedname}")
	public Object findDog(@PathVariable String breedname) {
		return this.restTemplate.getForEntity("https://api.thedogapi.com/v1/breeds/search?q=" + breedname, Object.class, this.headers);
	}
	
	@GetMapping(path = "/dog/image/{id}")
	public Object findImage(@PathVariable String id) {
		return this.restTemplate.getForEntity("https://api.thedogapi.com/v1/images/" + id, Object.class, this.headers);
	}
	
	@GetMapping(path = "/all")
	public Object findAll() {
		return this.restTemplate.getForEntity("https://api.thedogapi.com/v1/breeds", Object.class, this.headers);
	}
}
