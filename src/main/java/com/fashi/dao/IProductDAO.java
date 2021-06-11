package com.fashi.dao;

import java.util.List;

import com.fashi.model.Product;

public interface IProductDAO {
	List<Product> getByName(String name);
	
	List<Product> getByGroupName(String groupName);

	List<Product> getByBrandName(String brandName);
}
