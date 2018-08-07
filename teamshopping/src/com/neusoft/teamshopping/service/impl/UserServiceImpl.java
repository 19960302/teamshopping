package com.neusoft.teamshopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.teamshopping.dao.UserMapper;
import com.neusoft.teamshopping.service.UserService;
import com.neusoft.teamshopping.bean.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	/**
	 * 根据id查询user
	 */
	@Override
	public User getUser(Integer id) {
		User user=userMapper.selectByPrimaryKey(id);
		return user;
	}

}
