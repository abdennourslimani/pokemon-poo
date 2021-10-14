package Poke;

public class Main {

    public static void main(String[] args){

        System.out.println(" préparez vous le jeu va commencer : ");

        PokemonFeu pkFeu1 = new PokemonFeu("Salaméche",100,5);
        PokemonFeu pkfeu2 = new PokemonFeu("Canino",15,10);


        PokemonEau pkEau= new PokemonEau("Carapuce",80 , 3);



        PokemonPlante pkPlante = new PokemonPlante("bulbizarre",90,4);
        pkEau.attaquer(pkfeu2);
        pkEau.attaquer(pkfeu2);
        pkEau.attaquer(pkfeu2);
        pkEau.attaquer(pkfeu2);


    }


}
