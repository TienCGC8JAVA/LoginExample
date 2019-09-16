package com.codegym.repository.impl;

import com.codegym.model.Login;
import com.codegym.model.User;
import com.codegym.repository.LoginRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public class LoginRepositoryImpl implements LoginRepository {

  @PersistenceContext
  private EntityManager em;

  @Override
  public User checkLogin(Login login) {
    TypedQuery<User> query = em.createQuery("select u from  User u where u.account=:account and u.password=:password",User.class);
    query.setParameter("account", login.getAccount());
    query.setParameter("password", login.getPassword());
    try {
      return query.getSingleResult();
    } catch (NoResultException e){
      return null;
    }
  }
}
