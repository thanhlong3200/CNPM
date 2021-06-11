package com.fashi.dao.impl;

import java.util.List;

import com.fashi.dao.IProductDAO;
import com.fashi.mapper.ProductMapper;
import com.fashi.model.Product;

public class ProductDAO extends AbstractDAO<Product> implements IProductDAO{


	@Override
	public List<Product> getByName(String name) {
		name = "%"+name+"%";
		String sql = "select p.*,pg.name as group_name , pb.name as brand_name"
				+ " from products p join products_group pg on p.group_id = pg.id "
				+ "join products_brand pb on pb.id = p.brand_id"
				+ " where p.name like ? and p.status = 1";
		return query(sql, new ProductMapper(), name);
	}

	@Override
	public List<Product> getByGroupName(String groupName) {
		groupName = "%"+groupName+"%";
		String sql = "select p.*,pg.name as group_name , pb.name as brand_name"
				+ " from products p join products_group pg on p.group_id = pg.id "
				+ "join products_brand pb on pb.id = p.brand_id"
				+ " where pg.name like ? and p.status = 1  and pg.status = 1";
		return query(sql, new ProductMapper(), groupName);
	}

	@Override
	public List<Product> getByBrandName(String brandName) {
		brandName = "%"+brandName+"%";
		String sql = "select p.*,pg.name as group_name , pb.name as brand_name"
				+ " from products p join products_group pg on p.group_id = pg.id "
				+ "join products_brand pb on pb.id = p.brand_id"
				+ " where pb.name like ? and p.status = 1  and pb.status = 1";
		return query(sql, new ProductMapper(), brandName);
	}

	@Override
	public List<Product> getByGroupName(String groupName, int level) {
		String sql = "select p.*,pg.name as group_name , pb.name as brand_name"
				+ " from products p join products_group pg on p.group_id = pg.id "
				+ "join products_brand pb on pb.id = p.brand_id"
				+ " where pg.name like ? and p.status = 1  and pg.status = 1";
		return query(sql, new ProductMapper(), groupName);
	}

	@Override
	public List<Product> getAll() {
		String sql = "select p.*,pg.name as group_name , pb.name as brand_name"
				+ " from products p join products_group pg on p.group_id = pg.id "
				+ "join products_brand pb on pb.id = p.brand_id"
				+ " where p.status = 1";
		return query(sql, new ProductMapper());
	}

	@Override
	public Product getOne(Integer id) {
		String sql = "select p.*,pg.name as group_name , pb.name as brand_name"
				+ " from products p join products_group pg on p.group_id = pg.id "
				+ "join products_brand pb on pb.id = p.brand_id"
				+ " where p.id = ? and p.status = 1";
		return queryOne(sql, new ProductMapper(), id);
	}
	
	
	
}
