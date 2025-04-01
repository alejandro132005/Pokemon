package autonoma.pokemon.models;
/**
 * Modelo que representa un PokemonPlanta
 * @author Juanj Jose 
 * @since 20250331
 * @version 1.0
 */
public interface PokemonPlanta {
    /**
     * Modela el metodo de atacarParalizar
     * @return string
    */
    public abstract String atacarParalizar();
    /**
     * Modela el metodo de atacarDrenaje
     * @return string
    */
    public abstract String atacarDrenaje();
    /**
     * Modela el metodo de atacarHojaAfilada
     * @return string
    */
    public abstract String atacarHojaAfilada();
    /**
     * Modela el metodo de atacarLatigoCepa
     * @return string
    */
    public abstract String atacarLatigoCepa();
}