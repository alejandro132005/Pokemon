package autonoma.pokemon.models;

/**
 * Clase que representa a Pikachu, un Pokémon que hereda de la clase base Pokemon
 * e implementa la interfaz PokemonElectrico.
 * 
 * @author Alejandro
 * @since 20250331
 * @version 1.0
 */
public class Pikachu extends Pokemon implements PokemonElectrico {

    /**
     * Constructor que inicializa los atributos de Pikachu.
     *
     * @param numPokedex Número en la Pokédex
     * @param nombre     Nombre del Pokémon
     * @param peso       Peso del Pokémon
     * @param temporada  Temporada en la que aparece
     */
    public Pikachu(String numPokedex, String nombre, float peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }

    /**
     * Realiza el ataque Placaje.
     * 
     * @return Descripción del ataque
     */
    @Override
    public String atacarPlacaje() {
        return "Soy Pikachu y estoy atacando con Placaje";
    }

    /**
     * Realiza el ataque Arañazo.
     * 
     * @return Descripción del ataque
     */
    @Override
    public String atacarArañazo() {
        return "Soy Pikachu y estoy atacando con Arañazo";
    }

    /**
     * Realiza el ataque Mordisco.
     * 
     * @return Descripción del ataque
     */
    @Override
    public String atacarMordisco() {
        return "Soy Pikachu y estoy atacando con Mordisco";
    }

    /**
     * Realiza el ataque Impacto Trueno.
     * 
     * @return Descripción del ataque
     */
    @Override
    public String atacarImpacTrueno() {
        return "Soy Pikachu y estoy atacando con Impacto Trueno";
    }

    /**
     * Realiza el ataque Puño Trueno.
     * 
     * @return Descripción del ataque
     */
    @Override
    public String atacarPunioTrueno() {
        return "Soy Pikachu y estoy atacando con Puño Trueno";
    }

    /**
     * Realiza el ataque Rayo.
     * 
     * @return Descripción del ataque
     */
    @Override
    public String atacarRayo() {
        return "Soy Pikachu y estoy atacando con Rayo";
    }

    /**
     * Realiza el ataque Rayo Carga.
     * 
     * @return Descripción del ataque
     */
    @Override
    public String atacarRayoCarga() {
        return "Soy Pikachu y estoy atacando con Rayo Carga";
    }
}