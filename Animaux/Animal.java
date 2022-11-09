import java.util.ArrayList;
import java.util.Random;

public class Animal {
    public String nameSpecies;
    public String sexe;
    public int age;
    public int taille;
    public int poids;
    public int indicateurFaim = 100;
    public int indicateurSante = 100;
    public boolean indicateurSommeil;
    public String son;
    public Animal(String nameSpecies, String sexe, int age, int taille, int poids) {
        this.nameSpecies = nameSpecies;
        this.sexe = sexe;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
        this.indicateurSommeil = false;
    }
    public void manger(){
        if(!this.indicateurSommeil){
            if(this.indicateurFaim > 95){
                System.out.println("L'animal n'a pas assez faim");
            }
            else{
                this.indicateurFaim +=5;
            }

        }
    }
    public void sound(){
        System.out.println(this.son);
    }
    public void soin() {
        if (!this.indicateurSommeil) {
            if (this.indicateurFaim > 80) {
                System.out.println("L'animal n'a pas besoin de soin");
            } else {
                this.indicateurSante += 20;
            }
        }
    }
    public void wakeUpOrFallAsleep(){
        this.indicateurSommeil = !indicateurSommeil;
    }
    public Animal enfanter(){
        if(this.sexe == "male"){
            System.err.println("Impossible, c'est un male !");
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
