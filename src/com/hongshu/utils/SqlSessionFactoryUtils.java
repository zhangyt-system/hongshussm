package com.hongshu.utils;



import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class SqlSessionFactoryUtils {
	private static SqlSessionFactory sqlSessionFactory;

	static {
		
		try {
			// 创建SqlSessionFactoryBuilder对象
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			// 创建核心配置文件的输入流
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			// 通过输入流创建SqlSessionFactory对象
			sqlSessionFactory = ssfb.build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * 获取SqlSessionFactory
	 * @return
	 */
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
