package autonoma.pokemon.models;

/**
 * Clase abstracta que representa un Pokémon y define sus atributos y métodos básicos.
 * Sirve como modelo base para otros tipos de Pokémon.
 * 
 * @author Alejandro
 * @since 20250331
 * @version 1.0
 */
public abstract class Pokemon {
    
    // Atributos
    /**
     * Número de la Pokédex del Pokémon.
     */
    private String numPokedex;
    
    /**
     * Nombre del Pokémon.
     */
    private String nombre;
    
    /**
     * Peso del Pokémon.
     */
    private float peso;
    
    /**
     * Temporada en la que aparece el Pokémon.
     */
    private String temporada;

    // Constructor
    
    /**
     * Constructor que inicializa los atributos principales del Pokémon.
     * 
     * @param numPokedex Número de la Pokédex
     * @param nombre     Nombre del Pokémon
     * @param peso       Peso del Pokémon
     * @param temporada  Temporada en la que aparece
     */
    public Pokemon(String numPokedex, String nombre, float peso, String temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }
    
    // Métodos getter y setter
    
    /**
     * Obtiene el número de la Pokédex del Pokémon.
     * 
     * @return Número de la Pokédex
     */
    public String getNumPokedex() {
        return numPokedex;
    }

    /**
     * Establece el número de la Pokédex del Pokémon.
     * 
     * @param numPokedex Número de la Pokédex
     */    
    public void setNumPokedex(String numPokedex) {
       this.numPokedex = numPokedex;
    }

    /**
     * Obtiene el nombre del Pokémon.
     * 
     * @return Nombre del Pokémon
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del Pokémon.
     * 
     * @param nombre Nombre del Pokémon
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene el peso del Pokémon.
     * 
     * @return Peso del Pokémon
     */
    public float getPeso() {
        return peso;
    }
    
    /**
     * Establece el peso del Pokémon.
     * 
     * @param peso Peso del Pokémon
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    /**
     * Obtiene la temporada en la que aparece el Pokémon.
     * 
     * @return Temporada del Pokémon
     */
    public String getTemporada() {
        return temporada;
    }
    
    /**
     * Establece la temporada en la que aparece el Pokémon.
     * 
     * @param temporada Temporada del Pokémon
     */
    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    
    // Métodos abstractos
    
    /**
     * Define el ataque Placaje que debe implementar cada Pokémon.
     * 
     * @return Descripción del ataque Placaje
     */
    public abstract String atacarPlacaje();
    
    /**
     * Define el ataque Arañazo que debe implementar cada Pokémon.
     * 
     * @return Descripción del ataque Arañazo
     */
    public abstract String atacarArañazo();
    
    /**
     * Define el ataque Mordisco que debe implementar cada Pokémon.
     * 
     * @return Descripción del ataque Mordisco
     */
    public abstract String atacarMordisco();
}