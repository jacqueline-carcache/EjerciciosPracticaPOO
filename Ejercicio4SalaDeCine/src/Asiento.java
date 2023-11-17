class Asiento {
    boolean ocupado;

    // Constructor
    public Asiento() {
        this.ocupado = false;
    }

    // Getters y Setters
    public boolean mostrarOcupado() {
        return ocupado;
    }

    public void cambiarOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
}
