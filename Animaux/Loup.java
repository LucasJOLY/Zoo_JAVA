package Animaux;

import Animaux.Mammifere;

public class Loup extends Mammifere {

    public Loup(String sexe, int age, int taille, int poids) {
        super("Animaux.Loup", sexe,age,taille,poids);
        this.son = "Ahouuuu !";
    }
    public void vaguabonder(){

    }


}
