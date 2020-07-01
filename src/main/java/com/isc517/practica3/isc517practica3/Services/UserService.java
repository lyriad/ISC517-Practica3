package com.isc517.practica3.isc517practica3.Services;

import com.isc517.practica3.isc517practica3.Models.User;
import com.isc517.practica3.isc517practica3.Repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public User getUsuarioByUsernameAndPassword(String username, String password){
        return userRepository.findUsuarioByUsernameAndPassword(username, password);
    }
}