package Poke;

public class PokemonFeu extends Pokemon {


    public PokemonFeu() {

    }

    public PokemonFeu(String nom, double healthPoints, double atk) {

        super(nom, healthPoints, atk);
    }

    public void attaquer(Pokemon p ){
        boolean dead = p.isDead();

        if (!dead) {

        if(p instanceof  PokemonPlante){
            // feu    -> contre plante  ( 2 * atk )
            p.healthPoints -= 2*( this.atk );
            System.out.println(this.nom + " va attaquer "+p.nom +" :");
            System.out.println("nombre de vie du pokemonc "+p.nom + " est " + p.healthPoints);

        }else if( p instanceof PokemonEau || p instanceof PokemonFeu){
            // Feu ->  contre ( feu  + eau ) (0.5 atk )
            p.healthPoints -= 0.5*( this.atk );
            System.out.println(this.nom +  " va attaquer "+p.nom +" :");
            System.out.println("nombre de vie du pokemon "+p.nom +  " est " + p.healthPoints);

        }else {
            // Feu -> atk pour normaux .
            super.attaquer(p);
            System.out.println(this.nom + " va attaquer "+p.nom +" :");
            System.out.println("nombre de vie du pokemon "+p.nom + " est " + p.healthPoints);
        }
        }

    }

    @Override
    public String toString() {
        return "PokemonFeu{" +
                "nom='" + nom + '\'' +
                ", healthPoints=" + healthPoints +
                ", atk=" + atk +
                '}';
    }
}
