package com.security.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.security.model.Authority;
import com.security.security.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

        @Autowired
        UserRepository userRepository;
        
        @Override
         public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            
         //Buscar el usuario con el repositorio y si no existe lanzar una exepcion
         com.security.security.model.User appUser = 
                     userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("No existe usuario"));
            
        //Mapear nuestra lista de Authority con la de spring security 
        List gantList = new ArrayList();
        for (Authority authority: appUser.getAuthority()) { //es un for each, donde rellenamos la lista con los usuarios y su rol
            // ROLE_USER, ROLE_ADMIN,..
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAuthority());
                gantList.add(grantedAuthority);
        }
            
        //Crear El objeto UserDetails que va a ir en sesion y retornarlo.
        //Crea el objeto usuario con la informacion de seguridad mas importante
        UserDetails user = (UserDetails) new User(appUser.getUsername(), appUser.getPassword(), gantList);
             return user;
        }
}


