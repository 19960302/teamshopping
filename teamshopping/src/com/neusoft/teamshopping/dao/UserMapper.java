package com.neusoft.teamshopping.dao;

import org.springframework.stereotype.Repository;

import com.neusoft.teamshopping.bean.User;

@Repository("userMapper")
public interface UserMapper {

    User selectByPrimaryKey(Integer id);

}