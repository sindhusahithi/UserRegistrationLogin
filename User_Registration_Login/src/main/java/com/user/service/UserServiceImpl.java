package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.user.dao.UserDao;
import com.user.model.Login;
import com.user.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
