package com.blog.service;

import java.util.List;
import java.util.Map;

import com.blog.model.Article;

public interface ArticleService {
	int deleteByPrimaryKey(Integer id);
	int insert(Article record);
	int insertSelective(Article record);
	Article selectByPrimaryKey(Integer id);
	int updateByPrimaryKeySelective(Article record);
	int updateByPrimaryKey(Article record);
	List<Article> selectArticleList();
	List<Map<String, Object>> getCommentsByArticleId(Integer id);
//	逻辑事务处理
	Map<String,Object> getAllArticle(); 
}
