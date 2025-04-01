package autonoma.pokemon.models;

/**
 * Modelo que permite representar un pokemon de agua.
 * Representa los ataques caracteristicos de los pokemon de tipo agua.
 * 
 * @author Juan Jose
 * @since 20250331
 * @version 1.0
 */
public interface PokemonAgua {
    /**
     * Metodo que representa el ataque Hidrobomba.
     * 
     * @return Descripcion del ataque Hidrobomba
     */
    public abstract String atacarHidroBommba();
    
    /**
     * Metodo que representa el ataque Pistola Agua.
     * 
     * @return Descripcion del ataque Pistola Agua
     */
    public abstract String atacarPistolaAgua();
    
    /**
     * Metodo que representa el ataque Burbuja.
     * 
     * @return Descripcion del ataque Burbuja
     */
    public abstract String atacarBurbuja();
    
    /**
     * Metodo que representa el ataque Hidropulso.
     * 
     * @return Descripcion del ataque Hidropulso
     */
    public abstract String atacarHidroPulso();
}