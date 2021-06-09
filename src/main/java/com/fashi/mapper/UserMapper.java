package com.fashi.mapper;

import java.sql.ResultSet;

import com.fashi.model.UserModel;

public class UserMapper implements RowMapper<UserModel>{

	@Override
	public UserModel mapRow(ResultSet rs) {
		UserModel user = new UserModel();
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
