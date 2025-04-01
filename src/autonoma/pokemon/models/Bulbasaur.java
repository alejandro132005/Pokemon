
package autonoma.pokemon.models;
/**
 * Modelo que representa un Pokemon que hereda de Pokemon e implementa PokemonPlanta
 * @author Alejandro
 * @since 20250331
 * @version 1.0
 */
public class Bulbasaur extends Pokemon implements PokemonPlanta{
    /**
     * Inicializa los atributos de la clase Bulbasaur
     *
     * @param     nombre    
     * @param     numPokedex
     * @param     peso
     * @param     temporada
    */
    public Bulbasaur(String numPokedex, String nombre, float peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }

    /**
     * Metodo abstracto atacarPlacaje
     * @return String
    */
    @Override
    public String atacarPlacaje() {
        return "Soy Balbasaur y ataco con Placaje";
    }

    /**
     * Metodo abstracto atacarArañazo
     * @return String
    */
    @Override
    public String atacarArañazo() {
        return "Soy Balbasaur y ataco con Arañazo";
    }
    
    /**
     * Metodo abstracto atacarMordisco
     * @return String
    */
    @Override
    public String atacarMordisco() {
        return "Soy Balbasaur y ataco con Mordisco";
    }

    /**
     * Metodo abstracto atacarParalizar
     * @return String
    */
    @Override
    public String atacarParalizar() {
        return "Soy Balbasaur y ataco con Paralizar";
    }

    /**
     * Metodo abstracto atacarDrenaje
     * @return String
    */
    @Override
    public String atacarDrenaje() {
        return "Soy Balbasaur y ataco con Drenaje";
    }

    /**
     * Metodo abstracto atacarHojaAfilada
     * @return String
    */
    @Override
    public String atacarHojaAfilada() {
        return "Soy Balbasaur y ataco con HojaAfilada";
    }
    
    /**
     * Metodo abstracto atacarLatigoCepa
     * @return String
    */
    @Override
    public String atacarLatigoCepa() {
        return "Soy Balbasaur y ataco con LatigoCepa";
    }
}