package autonoma.pokemon.models;

/**
 * Modelo que representa un PokemonPlanta.
 * Define los ataques caracteristicos de los pokemon de tipo planta.
 * 
 * @author Juan Jose
 * @since 20250331
 * @version 1.0
 */
public interface PokemonPlanta {
    /**
     * Metodo que representa el ataque Paralizar.
     * 
     * @return Descripcion del ataque Paralizar
     */
    public abstract String atacarParalizar();
    
    /**
     * Metodo que representa el ataque Drenaje.
     * 
     * @return Descripcion del ataque Drenaje
     */
    public abstract String atacarDrenaje();
    
    /**
     * Metodo que representa el ataque Hoja Afilada.
     * 
     * @return Descripcion del ataque Hoja Afilada
     */
    public abstract String atacarHojaAfilada();
    
    /**
     * Metodo que representa el ataque Latigo Cepa.
     * 
     * @return Descripcion del ataque Latigo Cepa
     */
    public abstract String atacarLatigoCepa();
}