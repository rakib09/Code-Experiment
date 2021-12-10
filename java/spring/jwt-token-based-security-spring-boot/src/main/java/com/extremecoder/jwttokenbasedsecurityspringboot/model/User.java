package com.extremecoder.jwttokenbasedsecurityspringboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_store")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username;
    private String password;
    private String roles;
    private boolean enabled=true;
}