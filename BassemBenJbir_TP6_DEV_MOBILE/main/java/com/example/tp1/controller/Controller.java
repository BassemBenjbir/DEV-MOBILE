package com.example.tp1.controller;

import com.example.tp1.model.Patient;

public class Controller {
    private static Patient patient;
    private static com.example.tp1.controller.Controller instance;

    private Controller(){
        super();
    }
    public static final com.example.tp1.controller.Controller getInstance(){
        if(Controller.instance == null)
            Controller.instance = new Controller();
        return Controller.instance;
    }

    //Flèche "Update" Controller --> Model
    public void createPatient(int age, float valeurMesuree, boolean isFasting){
        patient = new Patient(age, valeurMesuree, isFasting);
    }
    //Flèche "Notify" Model --> Controller
    public String getReponse() {
        return patient.getReponse();
    }
}
