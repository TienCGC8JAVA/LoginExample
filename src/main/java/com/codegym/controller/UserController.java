package com.codegym.controller;

import com.codegym.model.Login;
import com.codegym.model.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

  @GetMapping("/")
  String showForm() {
    return "home";
  }

  @RequestMapping("/register")
  String showCreate() {
    return "register";
  }

  @RequestMapping("/forgot-password")
  String showForgotPassword() {
    return "forgot-password";
  }

  @Autowired
  public UserService userService;

  @PostMapping("/checkLogin")
  public ModelAndView checkLogin(@ModelAttribute Login login) {
    ModelAndView modelAndView = new ModelAndView("success");
    User user = userService.checkLogin(login);
    if (null != user && user.getAccount().equals(login.getAccount())
        && user.getPassword().equals(login.getPassword())) return modelAndView;
    return null;
  }
}
