package autonoma.pokemon.models;

/**
 * Muestra que representa un PokemonFuego.
 * Define los ataques caracteristicos de los pokemon de tipo fuego.
 * 
 * @author Juan Jose 
 * @since 20250331
 * @version 1.0
 */
public interface PokemonFuego {
    /**
     * Metodo que representa el ataque Punio Fuego.
     * 
     * @return Descripcion del ataque Punio Fuego
     */
    public abstract String atacarPunioFuego();
    
    /**
     * Metodo que representa el ataque Ascuas.
     * 
     * @return Descripcion del ataque Ascuas
     */
    public abstract String atacarAscuas();
    
    /**
     * Metodo que representa el ataque Lanza Llamas.
     * 
     * @return Descripcion del ataque Lanza Llamas
     */
    public String atacarLanzaLlamas();
}