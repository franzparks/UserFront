package com.userfront.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userfront.Dao.UserDao;
import com.userfront.domain.User;
import com.userfront.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void save(User user) {
        userDao.save(user);
    }
	
	public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
