package com.codegym.service;

import java.util.List;

public interface GeneralService<E> {
  List<E> findAll();

  E findById(int id);

  void save(E model);

  void remove(int id);
}
