package com.java.Security4;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.java.Security4.model.MyUserDetails;
import com.java.Security4.model.User;

public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User>user =userRepository.findByUsername(username);
        user.orElseThrow(()-> new UsernameNotFoundException("Not found"));

      return user.map(MyUserDetails::new).get();
	}

}
