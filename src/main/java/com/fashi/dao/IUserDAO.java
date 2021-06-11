package com.fashi.dao;

import com.fashi.model.User;

public interface IUserDAO extends GenericDAO<User>{

	User getUser(String username);

	Integer insert(User user);

	User getUser(Integer id);

}
