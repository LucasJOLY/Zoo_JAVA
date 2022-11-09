package Animaux;
import Animaux.Mammifere;
import Animaux.Marins;

public class Baleine extends Mammifere implements Marins {
    public Baleine(String nameSpecies, String sexe, int age, int taille, int poids) {
        super(nameSpecies, sexe, age, taille, poids);
    }

    public void nager() {

    }
}
