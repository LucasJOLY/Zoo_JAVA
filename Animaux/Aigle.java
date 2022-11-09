import Animaux.Animal;
import Animaux.Volants;

public class Aigle extends Animal implements Volants {

    public Aigle(String sexe, int age, int taille, int poids) {
        super("Animaux.Aigle", sexe, age, taille, poids);
        this.son = "iiiiiih";
    }

    public void voler() {

    }
}
