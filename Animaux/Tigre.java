package Animaux;

import Animaux.Mammifere;

public class Tigre extends Mammifere {

        public Tigre(String sexe, int age, int taille, int poids) {
            super("Animaux.Tigre", sexe, age, taille, poids);
            this.son = "Roarrrr !";
        }



        public void vaguabonder(){
        }

    }
