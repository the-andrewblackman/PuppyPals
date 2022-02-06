package net.revature.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import net.revature.model.Account;

@SuppressWarnings("serial")
public class MyUserDetails implements UserDetails {
	

	private String username;
	private String pass;

	
	public MyUserDetails(Account user) {
		this.username = user.getUsername();
		this.pass = user.getPass();
	
	}


	public MyUserDetails() {
		
		
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return pass;
	}



	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}



	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}



	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}



	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}



	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}



}
