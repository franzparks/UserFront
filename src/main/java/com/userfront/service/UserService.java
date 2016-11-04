package com.userfront.service;

import com.userfront.domain.User;

public interface UserService {
	
	User findByEmail(String email);
	
	boolean checkUserExists(String username, String email);
	
	boolean checkUsernameExists(String username);
	
	boolean checkEmailExists(String email);
	
	User saveUser(User user);
}
