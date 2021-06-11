package com.fashi.dao.impl;

import java.util.List;

import com.fashi.dao.IUserDAO;
import com.fashi.mapper.UserMapper;
import com.fashi.model.User;

public class UserDAO extends AbstractDAO<User> implements IUserDAO{
	
	@Override
	public User getUser(String username) {
		String sql = "SELECT * FROM users WHERE username = ?";
		List<User> users = query(sql, new UserMapper(), username);
		return users.isEmpty() ? null : users.get(0);
	}

	@Override
	public Integer insert(User user) {
		StringBuilder sql = new StringBuilder("insert into users " +
				"(fullname,username, password, email,status,group_id, gender,phone,address,date_register) ");
		sql.append("value (?,?,?,?,?,?,?,?,?,?) ");
		return insert(sql.toString(),
				user.getFullname(),
				user.getUsername(),
				user.getPassword(),
				user.getEmail(),
				user.getStatus(),
				user.getGroupId(),
				user.getGender(),
				user.getPhone(),
				user.getAddress(),
				user.getDateRegister()
				);
	}

	@Override
	public User getUser(Integer id) {
		String sql = "SELECT * FROM users WHERE id = ?";
		List<User> users = query(sql, new UserMapper(), id);
		return users.isEmpty() ? null : users.get(0);
	}
	
}
