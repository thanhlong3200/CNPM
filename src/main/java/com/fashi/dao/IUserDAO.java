package com.fashi.dao;

import com.fashi.model.UserModel;

public interface IUserDAO extends GenericDAO<UserModel>{

	UserModel getUser(String username);

	Integer insert(UserModel user);

	UserModel getUser(Integer id);

}
