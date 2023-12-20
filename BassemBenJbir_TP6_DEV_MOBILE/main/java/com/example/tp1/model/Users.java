package com.example.tp1.model;

public class Users {
    private String users;
    private String motpasse;

    public Users(String users , String motpasse) {
        this.users = users;
        this.motpasse=motpasse;

    }

    public String getUsers() {
        return users;
    }

    public String getMotpasse() {
        return motpasse;
    }
}
