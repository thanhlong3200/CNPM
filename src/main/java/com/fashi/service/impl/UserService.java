package com.fashi.service.impl;

import javax.inject.Inject;

import com.fashi.dao.IUserDAO;
import com.fashi.model.UserModel;
import com.fashi.service.IUserService;

public class UserService implements IUserService{
	
	@Inject
	private IUserDAO userDAO;
	
	@Override
	public UserModel getUser(String username) {
		return userDAO.getUser(username);
	}

	@Override
	public UserModel register(UserModel user) {
		Integer id = userDAO.insert(user);
		return userDAO.getUser(id);
	}
	
}
