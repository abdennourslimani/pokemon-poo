package Poke;

public class PokemonPlante extends Pokemon{
    public PokemonPlante() {

    }

    public PokemonPlante(String nom, double healthPoints, double atk) {
        super(nom, healthPoints, atk);
    }



    public void attaquer(Pokemon p ){
        boolean dead = p.isDead() ;

        if (!dead){


            if(p instanceof  PokemonEau ){
            // Plante   -> contre Eau  ( 2 * atk )
            p.healthPoints -= 2*( this.atk );
            System.out.println(this.nom + " va attaquer "+p.nom +" :");
            System.out.println("nombre de vie du pokemon "+p.nom + " est " + p.healthPoints);


        }else if( p instanceof PokemonFeu || p instanceof PokemonPlante )
            p.healthPoints -= 0.5*( this.atk );
            System.out.println(this.nom + " va attaquer "+p.nom +" :");
            System.out.println("nombre de vie du pokemon "+p.nom + " est " + p.healthPoints);

        }else {
            // plante - > atk pour autres .
            super.attaquer(p);
            System.out.println(this.nom + " va attaquer "+p.nom +" :");
            System.out.println("nombre de vie du pokemon "+p.nom + " est " + p.healthPoints);

        }


    }

    @Override
    public String toString() {
        return "PokemonPlante{" +
                "nom='" + nom + '\'' +
                ", healthPoints=" + healthPoints +
                ", atk=" + atk +
                '}';
    }
}

