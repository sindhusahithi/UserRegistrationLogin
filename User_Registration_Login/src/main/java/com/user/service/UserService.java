package com.user.service;

import com.user.model.Login;
import com.user.model.User;

public interface UserService {

  int register(User user);

  User validateUser(Login login);
}
