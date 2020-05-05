package com.hongshu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hongshu.pojo.Article;
import com.hongshu.pojo.User;
import com.hongshu.service.ArticleService;
import com.hongshu.service.UserService;

@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	@Autowired
	private UserService userservice;
	@RequestMapping("detail")
	@ResponseBody
	public Article getArticleById(Integer id){
		Article article = articleService.getArticleById(id);
		return article;
	}
	@RequestMapping("getlist")
	@ResponseBody
	public List<User> getIndexList(){
		return userservice.getIndexList();
	}
	
}
