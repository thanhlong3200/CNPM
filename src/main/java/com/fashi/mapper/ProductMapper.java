package com.fashi.mapper;

import java.sql.ResultSet;

import com.fashi.model.Product;

public class ProductMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs) {
		Product product = new Product();
		try {
			product.setId(rs.getInt("id"));
			product.setCollectionId(rs.getInt("collection_id"));
			product.setGroupId(rs.getInt("group_id"));
			product.setBrandId(rs.getInt("brand_id"));
			product.setOriginPrice(rs.getInt("origin_price"));
			product.setSellPrice(rs.getInt("sell_price"));
			product.setCode(rs.getString("code"));
			product.setName(rs.getString("name"));
			product.setDescription(rs.getString("descriptions"));
			product.setImageURL(rs.getString("image_url"));
		} catch (Exception e) {
			return null;
		}
		return product;
	}

}
