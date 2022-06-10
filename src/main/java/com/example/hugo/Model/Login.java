package com.example.hugo.Model;

import javax.persistence.*;

@Entity
@Table(name="login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="LOGIN_ID",nullable = false,unique = true)
    private long id;

    @Column(name="LOGIN_EMAIL",nullable = false,unique = true)
    private String email;

    @Column(name="LOGIN_PASSWORD",nullable = false,unique = true)
    private String password;

    public Login(String email,String password){
        this.email = email;
        this.password = password;
    }

    public Login(){}
}
