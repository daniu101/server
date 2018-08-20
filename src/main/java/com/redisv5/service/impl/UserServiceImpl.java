package com.redisv5.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.redisv5.dao.UserMapper;
import com.redisv5.model.User;
import com.redisv5.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userDao;

	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}
