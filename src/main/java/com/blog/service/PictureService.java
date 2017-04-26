package com.blog.service;

import com.blog.model.Picture;

public interface PictureService {
	int deleteByPrimaryKey(Integer id);
	int insert(Picture record);
	int insertSelective(Picture record);
	Picture selectByPrimaryKey(Integer id);
	int updateByPrimaryKeySelective(Picture record);
	int updateByPrimaryKey(Picture record);
}
