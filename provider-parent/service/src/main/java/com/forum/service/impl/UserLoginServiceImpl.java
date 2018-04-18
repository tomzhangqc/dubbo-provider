package com.forum.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.forum.dao.LoginDao;
import com.forum.model.LoginUser;
import com.forum.service.UserLoginService;
@Service
public class UserLoginServiceImpl implements UserLoginService{
	@Resource
	LoginDao loginDao;
	@Override
	public boolean login(LoginUser loginUser) {
		loginUser.setUserName("admin1");
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		loginUser.setLoginTime(dateString);
		loginUser.setLogNum(1);
		loginDao.login(loginUser);
		return false;
	}

}
