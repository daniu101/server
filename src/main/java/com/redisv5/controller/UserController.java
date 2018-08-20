package com.redisv5.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.redisv5.model.User;
import com.redisv5.service.IUserService;

@Controller
@RequestMapping("/user")
// /user/**
public class UserController {
	private static Logger log = LoggerFactory.getLogger(UserController.class);
	@Resource
	private IUserService userService;

	// /user/{id}
	@RequestMapping(value = "/jsontype/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> getUserInJson2(@PathVariable String id, Map<String, Object> model) {
		int priKeyId = Integer.parseInt(id);
		User user = this.userService.getUserById(priKeyId);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

}