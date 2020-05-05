package com.hongshu.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.hongshu.mapper.UserMapper;
import com.hongshu.pojo.User;
import com.hongshu.utils.SqlSessionFactoryUtils;

public class UserMapperTest {
@Test
public void testgetIndexList(){
	SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
	UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	List<User> list = userMapper.getIndexList();
	System.out.println("21321321321");
	for(User user2 : list){
		System.out.println(user2);
	}
}
}
