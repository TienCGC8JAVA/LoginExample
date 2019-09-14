package com.codegym.model;

public class User {
  private String account;
  private String password;
  private String name;
  private String email;
  private int birthday;
  private String address;

  public User(String account, String password, String name, String email, int birthday) {
    this.account = account;
    this.password = password;
    this.name = name;
    this.email = email;
    this.birthday = birthday;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getBirthday() {
    return birthday;
  }

  public void setBirthday(int birthday) {
    this.birthday = birthday;
  }
}
