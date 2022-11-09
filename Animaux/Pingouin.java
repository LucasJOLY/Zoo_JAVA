package Animaux;

import Animaux.Animal;
import Animaux.Marins;
import Animaux.Volants;

public class Pingouin extends Animal implements Volants, Marins {
    public Pingouin( String sexe, int age, int taille, int poids) {
        super("Animaux.Pingouin", sexe, age, taille, poids);

    }

    public void nager() {

    }

    public void voler() {

    }
}
