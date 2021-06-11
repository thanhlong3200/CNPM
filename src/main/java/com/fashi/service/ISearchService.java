package com.fashi.service;

import java.util.List;

import com.fashi.model.Product;

public interface ISearchService {
	List<Product> search(String filter, String keyword);
}
