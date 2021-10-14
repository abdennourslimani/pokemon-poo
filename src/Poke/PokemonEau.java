package Poke;

public class PokemonEau extends Pokemon{

    public PokemonEau() {

    }

    public PokemonEau(String nom, double healthPoints, double atk) {
        super(nom, healthPoints, atk);
    }

    public void attaquer(Pokemon p ){
        boolean dead = p.isDead() ;

        if (!dead){

        if(p instanceof  PokemonFeu ){

                    // Eau    -> contre feu  ( 2 * atk ) pour plante
            attaqueDouble(p, 2);


        }else if(( p instanceof PokemonEau || p instanceof PokemonPlante)  ){
            // Eau -> 0.5 atk contre (plante + eau ) d
            attaqueDouble(p, 0.5);
        }else {
            // Eau -> atk pour normaux .

            super.attaquer(p);
            System.out.println(this.nom + " va attaquer "+p.nom +" :");
            System.out.println("nombre de vie du pokemon "+p.nom +  " est " + p.healthPoints);
        }
        }  else {
            System.out.println( p.nom + " est mort .......");

        }
    }

    private void attaqueDouble(Pokemon p, double i) {
        p.healthPoints -= i * (this.atk);
        System.out.println(this.nom + " va attaquer " + p.nom + " :");
        System.out.println("nombre de vie du pokemon " + p.nom + " est " + p.healthPoints);
    }

    @Override
    public String toString() {
        return "PokemonEau{" +
                "nom='" + nom + '\'' +
                ", healthPoints=" + healthPoints +
                ", atk=" + atk +
                '}';
    }
}

