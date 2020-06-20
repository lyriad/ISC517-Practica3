package com.isc517.practica3.isc517practica3.Services;

import com.isc517.practica3.isc517practica3.Models.Form;
import com.isc517.practica3.isc517practica3.Models.Role;
import com.isc517.practica3.isc517practica3.Models.User;
import com.isc517.practica3.isc517practica3.Repositories.FormRepository;
import com.isc517.practica3.isc517practica3.Repositories.RoleRepository;
import com.isc517.practica3.isc517practica3.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SecurityService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FormRepository formRepository;

    @Autowired
    private RoleRepository roleRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public void createAdminUser() {

        Role adminRole = new Role("ADMIN");
        roleRepository.save(adminRole);

        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword(bCryptPasswordEncoder.encode("admin"));
        admin.setName("Admin");
        admin.setActive(true);
        admin.setRoles(new HashSet<>(Arrays.asList(adminRole)));
        userRepository.save(admin);

    }
    public void createUser() {
        
        Role userRole = new Role("USER");

        User user = new User();
        user.setUsername("user");
        user.setPassword(bCryptPasswordEncoder.encode("user"));
        user.setName("User");
        user.setActive(true);
        user.setRoles(new HashSet<>(Arrays.asList(userRole)));
        userRepository.save(user);

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
        for (Role role : user.getRoles()) {
            roles.add(new SimpleGrantedAuthority(role.getRole()));
        }

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>(roles);

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.isActive(), true, true, true, grantedAuthorities);
    }
}