package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.entities.User;

import java.util.List;


public interface UserService  {
  void save(User user);
  void deleteById(Integer id);

   User showUserById(Integer id);

   void update(Integer id, User user);

    User findByUsername(String email);
    User findByEmail(String email);
 List<User> getAllUsers();
}
