
package autonoma.pokemon.models;
/**
 * Modelo que representa un Pokemon que hereda de Pokemon e implementa PokemonElectrico
 * @author Alejandro 
 * @since 20250331
 * @version 1.0
 */
public class Pikachu extends Pokemon implements PokemonElectrico {
    /**
     * Inicializa los atributos de la clase Pikakhu
     *
     * @param     nombre    
     * @param     numPokedex
     * @param     peso
     * @param     temporada
    */
    public Pikachu(String numPokedex, String nombre, float peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }

    /**
     * Metodo abstracto atacarPlacaje
     * @return String
    */
    @Override
    public String atacarPlacaje() {
        return "soy pikachu y estoy atacando con placaje";
    }

    /**
     * Metodo abstracto atacarArañazo
     * @return String
    */
    @Override
    public String atacarArañazo() {
        return "soy pikachu y estoy atacando con arañazo";
    }

    /**
     * Metodo abstracto atacarMordisco
     * @return String
    */
    @Override
    public String atacarMordisco() {
        return "soy pikachu y estoy atacando con mordisco";
    }

    /**
     * Metodo abstracto atacarImpactoTrueno
     * @return String
    */
    @Override
    public String atacarImpacTrueno() {
        return "soy pikachu y estoy atacando con immpacto de trueno";
    }

    /**
     * Metodo abstracto atacarPunioFuego
     * @return String
    */
    @Override
    public String atacarPunioTrueno() {
        return "soy pikachu y estoy atacando con puño de tueno";
    }

    /**
     * Metodo abstracto atacarRayo
     * @return String
    */
    @Override
    public String atacarRayo() {
        return "soy pikachu y estoy atacando con rayo";
    }

    /**
     * Metodo abstracto atacarRayoCarga
     * @return String
    */
    @Override
    public String atacarRayoCarga() {
         return "soy pikachu y estoy atacando con rayo de carga";
    }
}