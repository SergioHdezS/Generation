package com.genspringboot.proyect.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.genspringboot.proyect.model.User;
import com.genspringboot.proyect.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
    
    private UserRepository userRepository;
    
    // esto que verifica que la conexion con la base de datos esta correcta
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(Integer id){
        //select*from user where id= id
        Optional <User> users = userRepository.findById(id);
        // el orElse nos permite verificar si hay o no hay datos dentro de nuestra lista, en caso de haber va a devolver el ususario, 
        //en caso contrario devuelve un null
        return users.orElse(null);
    }

    @Override
    public User save(User user){
        // inset into (columnas)(values); 
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id){
        //delete from user where id = id
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
