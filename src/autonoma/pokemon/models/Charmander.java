
package autonoma.pokemon.models;
/**
 * Modelo que representa un Pokemon que hereda de Pokemon e implementa PokemonFuego
 * @author Alejandro
 * @since 20250331
 * @version 1.0
 */
public class Charmander extends Pokemon implements PokemonFuego{
    /**
     * Inicializa los atributos de la clase Charmander
     *
     * @param     nombre    
     * @param     numPokedex
     * @param     peso
     * @param     temporada
    */
    public Charmander(String numPokedex, String nombre, float peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }
    
    /**
     * Metodo abstracto atacarPlacaje
     * @return String
    */
    @Override
    public String atacarPlacaje() {
        return "Soy Charmander y ataco con Placaje";
    }
    
    /**
     * Metodo abstracto atacarArañazo
     * @return String
    */
    @Override
    public String atacarArañazo() {
        return "Soy Charmander y ataco con Arañazo";
    }

    /**
     * Metodo abstracto atacarMordisco
     * @return String
    */
    @Override
    public String atacarMordisco() {
        return "Soy Charmander y ataco con Mordisco";
    }

    /**
     * Metodo abstracto atacarPunioFuego
     * @return String
    */
    @Override
    public String atacarPunioFuego() {
        return "Soy Charmander y ataco con Puño fuego";
    }

    /**
     * Metodo abstracto atacarAscuas
     * @return String
    */
    @Override
    public String atacarAscuas() {
        return "Soy Charmander y ataco con Ascuas";
    }

    /**
     * Metodo abstracto atacarLanzaLlamas
     * @return String
    */
    @Override
    public String atacarLanzaLlamas() {
        return "Soy Charmander y ataco con LanzaLlamas";
    }
}