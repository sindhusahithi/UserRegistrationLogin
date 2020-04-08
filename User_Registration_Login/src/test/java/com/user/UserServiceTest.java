package com.user;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.user.model.Login;
import com.user.model.User;
import com.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:jbr/config/user-beans.xml" })
public class UserServiceTest {

  @Autowired
  private UserService userService;

  @Test
  public void testRegister() {
    User user = new User();
    user.setUsername("sahoo");
    user.setPassword("sahoo");
    user.setEmail("sahoo@gmail.com");
    user.setPhone(99887766);

    int result = userService.register(user);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testValidateUser() {
    Login login = new Login();
    login.setUsername("sahoo");
    login.setPassword("sahoo");

    User user = userService.validateUser(login);
    Assert.assertEquals("sahoo", user.getUsername());
  }

}
