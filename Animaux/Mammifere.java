package Animaux;

import Animaux.Animal;

import java.util.ArrayList;
import java.util.Random;

public class Mammifere extends Animal {


    public Mammifere(String nameSpecies, String sexe, int age, int taille, int poids) {
        super(nameSpecies, sexe, age, taille, poids);
    }
    public Animal enfanter(){
        if(this.sexe == "male"){
            System.out.println("Impossible, c'est un male !");
            return null;
        }
        else {
            ArrayList<String> liste_sexe = new ArrayList<String>();
            liste_sexe.add("male");
            liste_sexe.add("femelle");
            int res = 0;
            Random hasard = new Random();
            if (hasard.nextBoolean()) res = 1 ;
            return new Animal(this.nameSpecies, liste_sexe.get(res), 0, 15, 700);
        }

    }
}