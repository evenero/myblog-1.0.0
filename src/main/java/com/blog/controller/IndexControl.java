package com.blog.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.blog.model.Article;
import com.blog.service.ArticleService;
import com.blog.service.PictureService;

@Controller
public class IndexControl {
	@Autowired
	private ArticleService articleService;
	@Autowired
	private PictureService pictureService;
//	@RequestMapping(method = RequestMethod.GET,value = "/index.htm")
//	public String init(){
//		System.err.println(articleService.selectByPrimaryKey(1));
//		return "index";
//	}
	@RequestMapping(method = RequestMethod.GET,value = "/index.htm")
	public String getArticleList(HttpServletRequest request,
			ModelMap map,HttpServletResponse response){
//		JSONObject res = JSONObject.fromObject(article);
		Article article = articleService.selectByPrimaryKey(2);
		map.put("article", article);
		Map<String, Object> articles = articleService.getAllArticle();
		map.put("articles", articles);
		return "index";
	}
	@RequestMapping(method = RequestMethod.GET,value = "/article.htm")
	public String getArticleById(HttpServletRequest request,
			ModelMap map,HttpServletResponse response){
		Integer art_id = Integer.parseInt(request.getParameter("id"));
		Article article = articleService.selectByPrimaryKey(art_id);
		map.put("article", article);
		return "view";
	}
	
}
