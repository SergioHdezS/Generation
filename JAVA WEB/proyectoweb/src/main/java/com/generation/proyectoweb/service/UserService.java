package com.generation.proyectoweb.service;

import java.util.List;

import com.generation.proyectoweb.model.User;

public interface UserService {
    //esta fuincion me traerá TODOS los usuarios que tenga
    List<User> getAll();

    //esta funcion me dejará agregar usuarios
    void add(User user);

    //esta funcion me deja eliminar eliminar usuarios
    void remove (User user);

    // esta funcion me permite obtener el tamaño del arreglo y map
    int size();
    
    // esta funcion me permite obtener un usuario segun su posicion
    User getUser(int position);
}
