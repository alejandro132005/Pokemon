package autonoma.pokemon.main;

import autonoma.pokemon.models.Bulbasaur;
import autonoma.pokemon.models.Charmander;
import autonoma.pokemon.models.Pikachu;
import autonoma.pokemon.models.Pokemon;
import autonoma.pokemon.models.PokemonAgua;
import autonoma.pokemon.models.PokemonElectrico;
import autonoma.pokemon.models.Squirtle;

/**
 * Modelo que representa el main - inicio
 * Representa la ejecucion principal del programa.
 * 
 * @author Juan Jose Cardona Daza
 * @since 20250401
 * @version 1.0
 */
public class PokemonInicio {
    public static void main(String[] args) {
        /** 
         * pokemon Charmander - pokemon fuego
        */
        Pokemon pokemonA = new Charmander("2", "Charmander", (float) 5.0, "Segunda temporada");
        /** 
         * pokemon Bulbasaur - pokemon planta
        */
        Pokemon pokemonB = new Bulbasaur("7", "Bulbasaur", (float) 4.8, "Primera temporada");
        /** 
         * pokemon Squirtle - pokemon agua
        */
        PokemonAgua pokemonC = new Squirtle("1", "Squirtle", (float) 2.3, "Primera temporada");
        /** 
         * pokemon Pikachu - pokemon electrico
        */
        PokemonElectrico pokemonD = new Pikachu("9", "Pikachu", (float) 6.2, "Primera temporada");
        
        System.out.println(pokemonA.atacarArañazo() + "\n");
        System.out.println(pokemonB.atacarMordisco() + "\n");
        System.out.println(pokemonC.atacarHidroBommba() + "\n");
        System.out.println(pokemonD.atacarImpacTrueno() + "\n");
    }
}