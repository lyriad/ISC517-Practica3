package com.isc517.practica3.isc517practica3.Models;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity
@EnableAutoConfiguration
public class Role implements Serializable {
    
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