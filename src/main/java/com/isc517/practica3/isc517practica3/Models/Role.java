package com.isc517.practica3.isc517practica3.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.lang.String;
import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false, unique = true)
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