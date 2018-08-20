package com.redisv5.service.impl;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.redisv5.dao.IUserDao;
import com.redisv5.model.User;
import com.redisv5.service.IUserService;


@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
