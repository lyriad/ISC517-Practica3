package com.isc517.practica3.isc517practica3.Repositories;

import com.isc517.practica3.isc517practica3.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);
    User findByUsername(String Username);
}
