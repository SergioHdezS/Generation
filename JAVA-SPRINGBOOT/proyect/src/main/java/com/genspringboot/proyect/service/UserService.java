package com.genspringboot.proyect.service;

import java.util.List;

import com.genspringboot.proyect.model.User;

public interface UserService {

    User getUser(Integer id);

    User save (User user);

    void delete(Integer id);

    List<User> getAllUsers();
    
}
