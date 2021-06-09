package com.fashi.service;

import com.fashi.model.UserModel;

public interface IUserService {

	UserModel getUser(String username);

	UserModel register(UserModel user);
	
}
