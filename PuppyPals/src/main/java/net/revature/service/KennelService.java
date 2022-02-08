package net.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.revature.model.Kennel;
import net.revature.repository.KennelRepository;

@Service("kennelService")
public class KennelService {
	
	@Autowired
	private KennelRepository kennelRepository;
	
	public void save(Kennel kennel) {
		this.kennelRepository.save(kennel);
	}
	
	public List<Kennel> findById(int id) {
		return this.kennelRepository.findById(id);
	}
	
	public List<Kennel> findAllByAccountId(int accountid){
		return this.kennelRepository.findAllByAccountid(accountid);
	}
	
	public List<Kennel> findAll(){
		return this.kennelRepository.findAll();
	}
	
	public void delete(Kennel kennel) {
		this.kennelRepository.delete(kennel);
	}
}
