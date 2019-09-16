package com.codegym.service;

import com.codegym.model.Login;
import com.codegym.model.User;

public interface LoginService {

  User checkLogin(Login login);

}
