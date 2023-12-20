package com.example.tp1.model;

public class Patient {
    private int Age;
    private double valeurM;
    private boolean  bt;
    private static String reponse;
    public Patient(int Age , double ValeurM , boolean bt ) {
        this.Age=Age;
        this.valeurM=valeurM;
        this.bt=bt;
        calculer();
    }
    public void calculer() {
        if (bt) {
            if (Age >= 13) {
                if (valeurM < 5.0)
                    reponse="Niveau de glycémie est trop bas";
                else if (valeurM >= 5.0 && valeurM <= 7.2)
                    reponse="Niveau de glycémie est normale";
                else
                    reponse="Niveau de glycémie est trop élevé";
            } else if (Age >= 6 && Age <= 12) {
                if (valeurM< 5.0)
                    reponse="Niveau de glycémie est trop bas";
                else
                if (valeurM>= 5.0 && valeurM <= 10.0)
                    reponse="Niveau de glycémie est normale";
                else
                    reponse="Niveau de glycémie est trop élevé";
            } else if (Age< 6) {
                if (valeurM< 5.5)
                    reponse="Niveau de glycémie est trop bas";
                else if (valeurM >= 5.5 && valeurM <= 10.0)
                    reponse="Niveau de glycémie est normale";
                else
                    reponse="Niveau de glycémie est trop élevé";
            }
        } else {
            if (valeurM > 10.5)
                reponse="Niveau de glycémie est trop élevé";
            else
                reponse="Niveau de glycémie est normale";
        }
    }




    public String getReponse() {return reponse;
    }
}