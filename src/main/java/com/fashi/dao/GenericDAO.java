package com.fashi.dao;

import java.util.List;

import com.fashi.mapper.RowMapper;

public interface GenericDAO<T> {
	List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
	T queryOne(String sql, RowMapper<T> rowMapper, Object[] parameters);
	Integer insert (String sql, Object... parameters);

}
