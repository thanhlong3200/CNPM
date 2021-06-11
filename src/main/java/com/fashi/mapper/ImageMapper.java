package com.fashi.mapper;

import java.sql.ResultSet;

import com.fashi.model.Image;

public class ImageMapper implements RowMapper<Image>{

	@Override
	public Image mapRow(ResultSet rs) {
		Image image = new Image();
		try {
			image.setId(rs.getInt("id"));
			image.setImageURL(rs.getString("image_url"));
			image.setProductId(rs.getInt("product_id"));
			image.setStatus(rs.getInt("status"));
		} catch (Exception e) {
			return null;
		}
		return image;
	}

}
