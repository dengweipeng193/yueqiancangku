package com.shop.service;

import java.util.List;

import com.shop.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.shop.dao.UserMapper;


@Service
public class UserServiceImpl implements UserService {
	
	
	
	@Autowired
	private UserMapper userMapper;

	public User selectUserByName(String name) {
		return  this.userMapper.selectUserByName(name);
	}


	
	

}
