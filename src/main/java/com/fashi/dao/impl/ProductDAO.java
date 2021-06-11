package com.fashi.dao.impl;

import java.util.List;

import com.fashi.dao.IProductDAO;
import com.fashi.mapper.ProductMapper;
import com.fashi.model.Product;

public class ProductDAO extends AbstractDAO<Product> implements IProductDAO{

	@Override
	public List<Product> getByName(String name) {
		name = "%"+name+"%";
		String sql = "select * from products where name like ? and status = 1";
		return query(sql, new ProductMapper(), name);
	}

	@Override
	public List<Product> getByGroupName(String groupName) {
		groupName = "%"+groupName+"%";
		String sql = "select * from products p join products_group pg on p.group_id = pg.id where pg.name like ? and p.status = 1  and pg.status = 1";
		return query(sql, new ProductMapper(), groupName);
	}

	@Override
	public List<Product> getByBrandName(String brandName) {
		brandName = "%"+brandName+"%";
		String sql = "select * from products p join products_brand pb on p.brand_id = pb.id where pb.name like ? and p.status = 1  and pb.status = 1";
		return query(sql, new ProductMapper(), brandName);
	}
	
	
	
}
