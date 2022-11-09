package Animaux;

import Animaux.Mammifere;

public class Ours extends Mammifere {


    public Ours(String sexe, int age, int taille, int poids) {
        super("Animaux.Ours", sexe, age, taille,poids);
        this.son = "Petit ours";
    }
}
