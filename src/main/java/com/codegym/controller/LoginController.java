package com.codegym.controller;

import com.codegym.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

  @GetMapping("/login")
  public String formLogin(){
    return "login";
  }

  @PostMapping("/checkLogin")
  public ModelAndView checkLogin(@ModelAttribute Login login){

    ModelAndView modelAndView = new ModelAndView("success");
    return modelAndView;
  }

}
