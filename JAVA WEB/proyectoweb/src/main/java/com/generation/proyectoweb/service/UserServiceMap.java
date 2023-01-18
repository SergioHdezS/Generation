package com.generation.proyectoweb.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.generation.proyectoweb.model.User;

@Primary
@Service
public class UserServiceMap implements UserService {
    
    private Map <Integer, User> userMap = new HashMap<>(); //creamos hashmap
    
    public UserServiceMap(){ //no sabemos
    }

    @Override
    public List<User> getAll() {
        List<User> userList = new ArrayList<>();
        for(Integer key: userMap.keySet()) {
            userList.add(userMap.get(key));
        }
        return userList;
    }

    @Override
    public void add(User user) {
        int llave = -1;  // asumimos que todas las llaves son NO negativas
        for(Integer key: userMap.keySet()) {
            if(key > llave) {
                llave = key;
            }
        }
        userMap.put(llave+1, user);
        return;
    }

    @Override
    public User getUser(int position) {
        return userMap.get(position);
    }

    @Override
    public void remove(User user) {
        int llave = -1;
        for(Integer key: userMap.keySet()) {
            if(user.equals(userMap.get(key))) {
                llave = key;
            }
        }
        if(llave != -1) {
            userMap.remove(llave);
        }
        return;
    }

    @Override
    public int size() {
        return userMap.size();
    } 

}
