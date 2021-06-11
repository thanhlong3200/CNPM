package com.fashi.dao.impl;

import java.util.List;

import com.fashi.dao.IStockDAO;
import com.fashi.mapper.StockMapper;
import com.fashi.model.Stock;

public class StockDAO extends AbstractDAO<Stock> implements IStockDAO{

	@Override
	public List<Stock> getByProductId(Integer productId) {
		String sql = "select s.*, ps.name as size from stocks s join products_size ps on s.size_id = ps.id"
				+ " where s.product_id = ?";
		return query(sql, new StockMapper(), productId);
	}
	
}
