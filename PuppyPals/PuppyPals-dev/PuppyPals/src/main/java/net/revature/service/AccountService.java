package net.revature.service;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//import java.util.Optional;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.revature.model.Account;
import net.revature.repository.AccountRepository;

@Service("accountService")
public class AccountService implements List<Account> {
	
	@Autowired
	private AccountRepository accountRepository;
	
	public void save(Account account) {
		this.accountRepository.save(account);
	}
	
	public Account findById(int id) {
		return this.accountRepository.findById(id);
	}
	
	public Optional<Account> findByUsername(String username) {
		return this.accountRepository.findByUsername(username);
	}
	
	public List<Account> findAll(){
		return this.accountRepository.findAll();
	}
	
	public void delete(Account account) {
		this.accountRepository.delete(account);
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Stream<Account> stream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Account> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Account e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Account> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Account> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account set(int index, Account element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Account element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<Account> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Account> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
