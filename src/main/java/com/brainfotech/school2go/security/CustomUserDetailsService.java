/**
 * 
 */
package com.brainfotech.school2go.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author Ramakrishna Sharvirala
 *
 */
public class CustomUserDetailsService implements UserDetailsService {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);
	
	@Override
	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	** Retrieves the correct ROLE type depending on the access level, where access level is an Integer.
	** Basically, this interprets the access value whether it's for a regular user or admin.
	** 
	** @param access an integer value representing the access of the user
	** @return collection of granted authorities
	*/
	public Collection<GrantedAuthority> getAuthorities(Integer access) {
		// Create a list of grants for this user
		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(2);
		// All users are granted with ROLE_USER access
		// Therefore this user gets a ROLE_USER by default 
		logger.debug("Grant ROLE_USER to this user");
		authList.add(new SimpleGrantedAuthority("ROLE_USER"));
		// Check if this user has admin access
		// We interpret Integer(1) as an admin user
		if ( access.compareTo(1) == 0) {
			// User has admin access
			logger.debug("Grant ROLE_ADMIN to this user");
			authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		}
		// Return list of granted authorities
		return authList;
	}

}
