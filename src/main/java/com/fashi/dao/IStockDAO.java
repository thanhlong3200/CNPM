package com.fashi.dao;

import java.util.List;

import com.fashi.model.Stock;

public interface IStockDAO {
	List<Stock> getByProductId(Integer productId);
}
