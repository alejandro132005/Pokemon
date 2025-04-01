package autonoma.pokemon.models;

/**
 * Modelo que permite representar un pokemon
 * @author Alejandro
 * @since 20250331
 * @version 1.0
 */
public abstract class Pokemon {
    
    //Atributos
    /**
    * numero de pokedex 
    */
    private String numPokedex;
    
    /**
    * nombre del pokemon
    */
    private String nombre;
    
    /**
    * peso del pokemon
    */
    private float peso;
    
    /**
    * temporada del pokemon 
    */
    private String temporada;

    // metodo constructor
    
    /**
     * Inicializa los atributos de la clase 
     * @param numPokedex
     * @param nombre
     * @param peso
     * @param temporada
    */
    public Pokemon(String numPokedex, String nombre, float peso, String temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }
    
    /**
     * Retorna el numero de pokedex
     * @return numPokedex
    */
    public String getNumPokedex() {
        return numPokedex;
    }

    /**
     * Modifica el numero de  pokedex
     * @param numPokedex
    */    
    public void setNumPokedex(String numPokedex) {
       this.numPokedex = numPokedex;
    }

    /**
     * Retorna el nombre del pokemon
     * @return nombre
    */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del pokemon
     * @param nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Retorna el peso del pokemon
     * @return peso
    */
    public float getPeso() {
        return peso;
    }
    
    
    /**
     * Modifica el peso del pokemon
     * @param peso
    */
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    /**
     * Retorna la temporada del pokemon
     * @return temporada
    */
    public String getTemporada() {
        return temporada;
    }
    
    /**
     * Modifica la temporada del pokemon
     * @param temporada
    */
    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    
    /**
     * Modela el metodo de atacar placaje
     * @return String 
    */
    public abstract String atacarPlacaje();
    
    /**
     * Modela el metodo de atacar arañazo
     * @return String 
    */
    
    public abstract String atacarArañazo();
    
     /**
     * Modela el metodo de atacar mordisco
     * @return String 
    */
    
    public abstract String atacarMordisco();
}