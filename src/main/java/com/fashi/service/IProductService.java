package com.fashi.service;

import java.util.List;

import com.fashi.model.Product;

public interface IProductService {
	List<Product> getAll();

	Product getDetails(Integer id);
}
