package com.prj.springsecurityjwt;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
		//was used when it was not connected to h2 database.
	 @Override
	    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
	        return new User("foo", "foo", new ArrayList<>());
	    }
}
