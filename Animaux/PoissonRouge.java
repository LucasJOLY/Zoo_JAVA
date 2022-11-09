package Animaux;

import Animaux.Animal;
import Animaux.Marins;

public class PoissonRouge extends Animal implements Marins {

    public PoissonRouge(String sexe, int age, int taille, int poids) {
        super("Poisson Rouge", sexe, age, taille, poids);
    }
    public void nager() {

    }
}
