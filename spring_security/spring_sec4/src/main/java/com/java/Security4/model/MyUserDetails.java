package com.java.Security4.model;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {
	
	private  String userName;
    private String password;
    private boolean active;
    private String roles;
    private boolean accountNonLocked;
    private List<GrantedAuthority> authorities;
	
    
    public MyUserDetails(User user) {
		super();
		this.userName = userName;
		this.password = password;
		this.active = active;
		this.roles = roles;
		this.accountNonLocked = accountNonLocked;
		this.authorities = authorities;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}


	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}


	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}


	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return accountNonLocked;
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
		return active;
	}
    
    
}
