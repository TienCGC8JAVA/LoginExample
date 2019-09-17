package com.codegym.controller;


import com.codegym.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  @GetMapping("/login")
  public String showLoginForm(Model model){
    model.addAttribute("login", new Login());
    return "login";
  }

}
