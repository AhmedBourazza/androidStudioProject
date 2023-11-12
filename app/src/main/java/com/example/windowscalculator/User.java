package com.example.windowscalculator;

public class User {

    int id;

    String nom,prenom,email,password,lastPassword;

    public User() {
    }

    public User(int id, String nom, String prenom, String email, String password, String lastPassword) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.lastPassword = lastPassword;
    }
}
