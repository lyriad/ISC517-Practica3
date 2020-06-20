package com.isc517.practica3.isc517practica3.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.lang.String;
import javax.persistence.*;

@Entity
public class Role {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    String name;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public String getRole() {
        return name;
    }

    public void setRole(String name) {
        this.name = name;
    }
}