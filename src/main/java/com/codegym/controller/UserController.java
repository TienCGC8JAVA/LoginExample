package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

  @GetMapping("/")
  String showForm() {
    return "home";
  }

  @RequestMapping("/login")
  String showLogin(){
    return "login";
  }

  @RequestMapping("/create")
  String showCreate(){
    return "create";
  }

  @RequestMapping("/forgot-password")
  String showForgotPassword(){
    return  "forgot-password";
  }
}
