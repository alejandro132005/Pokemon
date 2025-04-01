package autonoma.pokemon.models;
/**
 * Modelo que representa un Pokemon que hereda de Pokemon e implementa PokemonAgua.
 * Representa los ataques y caracteristicas de un Pokemon de tipo agua.
 * 
 * @author Alejando
 * @since 20250331
 * @version 1.0
 */
public class Squirtle extends Pokemon implements PokemonAgua {
    /**
     * Inicializa los atributos de la clase Squirtle.
     *
     * @param     nombre    
     * @param     numPokedex
     * @param     peso
     * @param     temporada
    */
    public Squirtle(String numPokedex, String nombre, float peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }
    
    /**
     * Metodo abstracto atacarPlacaje.
     * 
     * @return String
    */
    @Override
    public String atacarPlacaje() {
       return "soy squirtle y estoy atacando con placaje";
    }

    /**
     * Metodo abstracto atacarArañazo.
     * 
     * @return String
    */
    @Override
    public String atacarArañazo() {
       return "soy squirtle y estoy atacando con arañazo";
    }

    /**
     * Metodo abstracto atacarMordisco.
     * 
     * @return String
    */
    @Override
    public String atacarMordisco() {
        return "soy squirtle y estoy atacando con mordisco";
    }

    /**
     * Metodo abstracto atacarHidroBomba.
     * 
     * @return String
    */
    @Override
    public String atacarHidroBommba() {
        return "soy squirtle y estoy atacando con hidrobomba";
    }

    /**
     * Metodo abstracto atacarPistolaAgua.
     * 
     * @return String
    */
    @Override
    public String atacarPistolaAgua() {
        return "soy squirtle y estoy atacando con pistola de agua";
    }

    /**
     * Metodo abstracto atacarBurbuja.
     * 
     * @return String
    */
    @Override
    public String atacarBurbuja() {
        return "soy squirtle y estoy atacando con burbuja";
    }

    /**
     * Metodo abstracto atacarHidroPulso.
     * 
     * @return String
    */
    @Override
    public String atacarHidroPulso() {
          return "soy squirtle y estoy atacando con hidropulso";
    }
}