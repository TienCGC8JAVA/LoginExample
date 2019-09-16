package com.codegym.repository;

import java.util.List;

public interface GeneralRepository<E> {

  List<E> findAll();

  E findById(int id);

  void save(E model);

  void remove(int id);
}
