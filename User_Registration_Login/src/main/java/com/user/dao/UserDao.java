package com.user.dao;

import com.user.model.Login;
import com.user.model.User;

public interface UserDao {

  int register(User user);

  User validateUser(Login login);
}
