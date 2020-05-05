package com.hongshu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hongshu.mapper.UserMapper;
import com.hongshu.pojo.User;
import com.hongshu.service.UserService;
@Service
public class UserServiceImpl implements UserService	{
	
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> getIndexList() {
		// TODO Auto-generated method stub
		return userMapper.getIndexList();
	}
}
