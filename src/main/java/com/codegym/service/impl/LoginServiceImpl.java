package com.codegym.service.impl;

import com.codegym.model.Login;
import com.codegym.model.User;
import com.codegym.repository.LoginRepository;
import com.codegym.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements LoginService {

  @Autowired
  private LoginRepository loginRepository;

  @Override
  public User checkLogin(Login login) {
    return loginRepository.checkLogin(login);
  }
}
