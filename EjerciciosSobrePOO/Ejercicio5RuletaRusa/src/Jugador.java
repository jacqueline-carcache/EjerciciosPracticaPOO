public class Jugador {
    private int id;
    private String nombre;
    private boolean vivo;

    // Getters y Setters
    public int mostrarId() {
        return id;
    }
    public void cambiarId(int id) {
        this.id = id;
    }
    public String mostrarNombre() {
        return nombre;
    }
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean mostrarVivo() {
        return vivo;
    }
    public void cambiarVivo(boolean vivo) {
        this.vivo = vivo;
    }
    // Constructor
    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.vivo = true;
    }
    // Metodos adicionales
    public void disparar(Revolver revolver) {
        System.out.println(this.nombre + " se apunta y dispara...");
        if (revolver.disparar()) {
            this.vivo = false;
            System.out.println("¡BANG! " + this.nombre + " ha muerto.");
        } else {
            System.out.println("Click. " + this.nombre + " ha sobrevivido.");
        }
    }   
    public boolean estaVivo() {
        return this.vivo;
    }
}
