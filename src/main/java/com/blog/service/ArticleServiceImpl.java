package com.blog.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.blog.dao.ArticleMapper;
import com.blog.model.Article;

public class ArticleServiceImpl implements ArticleService{
	@Autowired
	private ArticleMapper articleMapper;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return articleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Article record) {
		return articleMapper.insert(record);
	}

	@Override
	public int insertSelective(Article record) {
		return articleMapper.insertSelective(record);
	}

	@Override
	public Article selectByPrimaryKey(Integer id) {
		return articleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Article record) {
		return articleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Article record) {
		return articleMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Article> selectArticleList() {
		return articleMapper.selectArticleList();
	}

	@Override
	public List<Map<String, Object>> getCommentsByArticleId(Integer id) {
		return articleMapper.getCommentsByArticleId(id);
	}

	@Override
	public Map<String, Object> getAllArticle() {
		List<Article> articles = articleMapper.selectArticleList();
		Map<String, Object> art_map = new HashMap<>();
		for(Article art : articles){
			Map<String, Object> map = new HashMap<String,Object>();
			map.put("article", art);
			map.put("comments", articleMapper.getCommentsByArticleId(art.getId()));
			art_map.put(String.valueOf(art.getId()), map);
		}
		return art_map;
	}

}
