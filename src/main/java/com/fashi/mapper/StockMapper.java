package com.fashi.mapper;

import java.sql.ResultSet;

import com.fashi.model.Stock;

public class StockMapper implements RowMapper<Stock>{

	@Override
	public Stock mapRow(ResultSet rs) {
		Stock stock = new Stock();
		try {
			stock.setId(rs.getInt("id"));
			stock.setProductId(rs.getInt("product_id"));
			stock.setQuantity(rs.getInt("quantity"));
			stock.setSize(rs.getString("size"));
		} catch (Exception e) {
			return null;
		}

		return stock;
	}
	
}
