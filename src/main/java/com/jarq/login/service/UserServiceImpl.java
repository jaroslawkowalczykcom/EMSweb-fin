package com.jarq.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jarq.login.dao.UserDAO;
import com.jarq.login.entity.User;

@Service
public class UserServiceImpl implements UserService {

	// need to inject user dao
	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

	@Override
	@Transactional
	public void saveUser(User theUser) {

		userDAO.saveUser(theUser);

	}

	@Override
	@Transactional
	public User getUser(int theId) {
		
		return userDAO.getUser(theId);
	}

	@Override
	@Transactional
	public void deleteUser(int theId) {

		userDAO.deleteUser(theId);
		
	}

	@Override
	@Transactional
	public List<User> searchUsers(String theSearchName) {
		
		return userDAO.searchUsers(theSearchName);
	}

}
