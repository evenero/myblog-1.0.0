package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.blog.dao.PictureMapper;
import com.blog.model.Picture;

public class PictureServiceImpl implements PictureService{
	@Autowired
	private PictureMapper pictureMapper;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return pictureMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Picture record) {
		return pictureMapper.insert(record);
	}

	@Override
	public int insertSelective(Picture record) {
		return pictureMapper.insertSelective(record);
	}

	@Override
	public Picture selectByPrimaryKey(Integer id) {
		return pictureMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Picture record) {
		return pictureMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Picture record) {
		return pictureMapper.updateByPrimaryKey(record);
	}

}
