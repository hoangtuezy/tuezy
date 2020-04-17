package xyz.tuezy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import xyz.tuezy.dao.UserDAO;
import xyz.tuezy.model.Account;
@Service
public class UserDetailsServiceImpl  implements UserDetailsService{
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    Account appUser = this.userDAO.findUserAccount(username);
	    
        if (appUser == null) {
            System.out.println("User not found! " + username);
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
 
        System.out.println("Found User: " + appUser.getUserName());
 
        // [ROLE_USER, ROLE_ADMIN,..]
        List<String> roleNames = this.userDAO.getRoleNames(appUser.getId());
 
        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
        if (roleNames != null) {
            for (String role : roleNames) {
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(role);
                grantList.add(authority);
            }
        }
 
        UserDetails userDetails = (UserDetails) new org.springframework.security.core.userdetails.User(appUser.getUserName(), //
                appUser.getPassword(), grantList);
 
        return userDetails;
    }
	

}
