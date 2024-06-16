package com.sunbase.sunbasephaseone.model;

import jakarta.persistence.*;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String first_name;
    private String last_name;

    private String street;
    private String address;
    private String city;
    private String state;

    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String phone;
}
