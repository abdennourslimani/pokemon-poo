package Poke;

public class Pokemon {
    String nom;
    double healthPoints;
    double atk; // force de base de l'attaque

    public Pokemon() {


    }

    public Pokemon(String nom, double healthPoints, double atk) {
        this.nom = nom;
        this.healthPoints = healthPoints;
        this.atk = atk;
    }

    public boolean isDead() {
        boolean dead = false;
        if (this.healthPoints <= 0) {
            dead = true;
        }
        return dead;
    }

    public void attaquer(Pokemon p) {
        if (p.healthPoints >0 ){
            p.healthPoints -= this.atk;
        }else {
            p.healthPoints = 0 ;

        }
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nom='" + nom + '\'' +
                ", healthPoints=" + healthPoints +
                ", atk=" + atk +
                '}';
    }


};
