package com.fashi.mapper;

import java.sql.ResultSet;

import com.fashi.model.User;

public class UserMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs) {
		User user = new User();
		try {
			user.setId(rs.getInt("id"));
			user.setFullname(rs.getString("fullname"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setAddress(rs.getString("address"));
			user.setEmail(rs.getString("email"));
			user.setDateRegister(rs.getTimestamp("date_register"));
			user.setGender(rs.getString("gender"));
		} catch (Exception e) {
			return null;
		}
		return user;
	}
	
}
