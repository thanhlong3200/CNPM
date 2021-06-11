package com.fashi.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.fashi.dao.IImageDAO;
import com.fashi.dao.IProductDAO;
import com.fashi.dao.IStockDAO;
import com.fashi.model.Image;
import com.fashi.model.Product;
import com.fashi.service.IProductService;

public class ProductService implements IProductService{
	@Inject
	private IProductDAO productDAO;
	@Inject
	private IImageDAO imageDAO;
	@Inject
	private IStockDAO stockDAO;

	@Override
	public List<Product> getAll() {
		return productDAO.getAll();
	}

	@Override
	public Product getDetails(Integer id) {
		Product product = productDAO.getOne(id);
		product.setImages(imageDAO.getByProductId(id));
		product.setStocks(stockDAO.getByProductId(id));
		return product;
	}
	
}
