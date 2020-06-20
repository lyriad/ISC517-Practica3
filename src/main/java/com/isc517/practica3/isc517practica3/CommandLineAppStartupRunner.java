package com.isc517.practica3.isc517practica3;

import java.util.Arrays;
import java.util.HashSet;
import javax.transaction.Transactional;
import com.isc517.practica3.isc517practica3.Models.Role;
import com.isc517.practica3.isc517practica3.Models.User;
import com.isc517.practica3.isc517practica3.Repositories.RoleRepository;
import com.isc517.practica3.isc517practica3.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Role adminRole = roleRepository.findByName("ADMIN");
        if (adminRole == null) {
            adminRole = new Role("ADMIN");
            roleRepository.save(adminRole);
        }

        Role userRole = roleRepository.findByName("USER");
        if (userRole == null) {
            userRole = new Role("USER");
            roleRepository.save(userRole);
        }

        User admin = userRepository.findByUsername("admin");

        if (admin == null) {

            userRepository.save(new User("Admin", passwordEncoder.encode("admin"), true, "admin",
                    new HashSet<>(Arrays.asList(adminRole))));
        }

        User user = userRepository.findByUsername("user");

        if (user == null) {

            userRepository.save(new User("User", passwordEncoder.encode("user"), true, "user",
                    new HashSet<>(Arrays.asList(userRole))));
        }
    }
}