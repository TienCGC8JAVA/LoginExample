package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

  @GetMapping("/")
  String showForm() {
    return "home";
  }

  @RequestMapping("/register")
  String showCreate(){
    return "register";
  }

  @RequestMapping("/forgot-password")
  String showForgotPassword(){
    return  "forgot-password";
  }


}
