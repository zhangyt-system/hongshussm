package com.hongshu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hongshu.mapper.ArticleMapper;
import com.hongshu.pojo.Article;
import com.hongshu.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService{
	@Autowired
	private ArticleMapper articleMapper;
	@Override
	public Article getArticleById(Integer id) {
		// TODO Auto-generated method stub
		return articleMapper.getArticleById(id);
	}

}
