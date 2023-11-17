class Pelicula {
    
    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;

    // Constructor
    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }
    // Getters
    public String mostrarTitulo() {
        return titulo;
    }
    public int mostrarDuracion() {
        return duracion;
    }
    public int mostrarEdadMinima() {
        return edadMinima;
    }
    public String mostrarDirector() {
        return director;
    }
    
    // Setters
    public void cambiarTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void cambiarDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void cambiarEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
    public void cambiarDirector(String director) {
        this.director = director;
    }

}

