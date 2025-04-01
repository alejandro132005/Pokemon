package autonoma.pokemon.models;

/**
 * Modelo que permite representar un pokemon electrico.
 * Define los ataques caracteristicos de los pokemon de tipo electrico.
 * 
 * @author Juan Jose
 * @since 20250331
 * @version 1.0
 */
public interface PokemonElectrico {
    
    /**
     * Metodo que representa el ataque Impacto Trueno.
     * 
     * @return Descripcion del ataque Impacto Trueno
     */
    public abstract String atacarImpacTrueno();
    
    /**
     * Metodo que representa el ataque Punio Trueno.
     * 
     * @return Descripcion del ataque Punio Trueno
     */
    public abstract String atacarPunioTrueno();
    
    /**
     * Metodo que representa el ataque Rayo.
     * 
     * @return Descripcion del ataque Rayo
     */
    public abstract String atacarRayo();
    
    /**
     * Metodo que representa el ataque Rayo Carga.
     * 
     * @return Descripcion del ataque Rayo Carga
     */
    public abstract String atacarRayoCarga();
}