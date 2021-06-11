package com.fashi.service.impl;

import javax.inject.Inject;

import com.fashi.dao.IUserDAO;
import com.fashi.model.User;
import com.fashi.service.IUserService;

public class UserService implements IUserService{
	
	@Inject
	private IUserDAO userDAO;
	
	@Override
	public User getUser(String username) {
		return userDAO.getUser(username);
	}

	@Override
	public User register(User user) {
		Integer id = userDAO.insert(user);
		return userDAO.getUser(id);
	}
	
}
