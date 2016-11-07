package com.userfront.service;

import java.util.Set;

import com.userfront.domain.User;
import com.userfront.domain.security.UserRole;

public interface UserService {
	
	User findByEmail(String email);
	
	User findByUsername(String username);
	
	boolean checkUserExists(String username, String email);
	
	boolean checkUsernameExists(String username);
	
	boolean checkEmailExists(String email);
	
	User createUser(User user, Set<UserRole> userRoles);
	
	void save(User user);
}
