package com.fashi.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.fashi.dao.IProductDAO;
import com.fashi.model.Product;
import com.fashi.service.ISearchService;

public class SearchService implements ISearchService{
	
	@Inject
	private IProductDAO productDAO;
	
	@Override
	public List<Product> search(String filter, String keyword) {
		List<Product> list = new ArrayList<>();
		switch (filter) {
		case "product_name":
			list = productDAO.getByName(keyword);
			break;
		case "product_group":
			list = productDAO.getByGroupName(keyword);
			break;
		case "product_brand":
			list = productDAO.getByBrandName(keyword);
			break;
		default:
			break;
		}
		
		return list;
	}
	
}
