package com.example.tp1.controller;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.tp1.model.Users;

public class LoginController {

    private static final String PREF_NAME = "UserPreferences";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";

    private static LoginController instance;
    private Users user;

    private LoginController() {
        // Privé pour suivre le modèle singleton
    }

    public static LoginController getInstance() {
        if (instance == null) {
            instance = new LoginController();
        }
        return instance;
    }

    public void createUser(String username, String password, Context context) {
        user = new Users(username, password);

        // Obtenir le SharedPreferences
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);

        // Éditer le SharedPreferences en mode édition
        SharedPreferences.Editor editor = sharedPreferences.edit();

        // Ajouter les coordonnées de l'utilisateur
        editor.putString(KEY_USERNAME, user.getUsers());
        editor.putString(KEY_PASSWORD, user.getMotpasse());

        // Appliquer les modifications
        editor.apply();
    }

    public void recapUser(Context context) {
        // Obtenir le SharedPreferences
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);

        // Récupérer les coordonnées de l'utilisateur
        String username = sharedPreferences.getString(KEY_USERNAME, "");
        String password = sharedPreferences.getString(KEY_PASSWORD, "");

        // Mise à jour de l'instance User
        user = new Users(username, password);
    }

    public Users getUser() {
        return user;
    }
}
