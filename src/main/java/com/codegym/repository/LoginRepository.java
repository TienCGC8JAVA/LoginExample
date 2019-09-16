package com.codegym.repository;

import com.codegym.model.Login;
import com.codegym.model.User;

public interface LoginRepository {

  User checkLogin(Login login);

}
