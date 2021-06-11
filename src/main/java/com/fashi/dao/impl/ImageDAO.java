package com.fashi.dao.impl;

import java.util.List;

import com.fashi.dao.IImageDAO;
import com.fashi.mapper.ImageMapper;
import com.fashi.model.Image;

public class ImageDAO extends AbstractDAO<Image>implements IImageDAO{
	
	@Override
	public List<Image> getByProductId(Integer productId) {
		String sql = "select * from images where product_id = ?";
		return query(sql, new ImageMapper(), productId);
	}
	
}
