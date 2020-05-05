package com.hongshu.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.hongshu.mapper.ArticleMapper;
import com.hongshu.pojo.Article;
import com.hongshu.utils.SqlSessionFactoryUtils;

public class ArticleMapperTest {

	@Test
	public void testArticleById() {
		SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		//获取接口的代理人实现类
		ArticleMapper articleMapper = sqlSession.getMapper(ArticleMapper.class);
		
		Article article= articleMapper.getArticleById(30);
		System.out.println("21321324365");
		System.out.println(article);
		
		sqlSession.close();
	}

}
