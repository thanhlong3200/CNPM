package com.fashi.dao;

import java.util.List;

import com.fashi.model.Image;

public interface IImageDAO {
	List<Image> getByProductId(Integer productId);
}
