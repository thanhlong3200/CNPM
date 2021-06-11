package com.fashi.service;

import com.fashi.model.User;

public interface IUserService {

	User getUser(String username);

	User register(User user);
	
}
