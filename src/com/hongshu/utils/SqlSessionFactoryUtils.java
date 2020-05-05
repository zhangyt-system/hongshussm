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
			// ����SqlSessionFactoryBuilder����
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			// �������������ļ���������
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			// ͨ������������SqlSessionFactory����
			sqlSessionFactory = ssfb.build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * ��ȡSqlSessionFactory
	 * @return
	 */
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
