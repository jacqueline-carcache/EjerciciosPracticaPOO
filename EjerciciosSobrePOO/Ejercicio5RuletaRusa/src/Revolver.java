import java.util.Random;

class Revolver {
    private int posicionActual;
    private int posicionBala;

    public Revolver() {
        this.posicionActual = 1;
        this.posicionBala = new Random().nextInt(6) + 1; // Coloca la bala en una posición aleatoria entre 1 y 6.
    }
    // Getters
    public int mostrarPosicionActual() {
        return posicionActual;
    }
    public int mostrarPosicionBala() {
        return posicionBala;
    }
    // Setters
    public void cambiarPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }
    public void cambiarPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }
    // metodos adicionales
    public boolean disparar() {
        return this.posicionActual == this.posicionBala;
    }

    public void siguienteBala() {
        this.posicionActual = (this.posicionActual % 6) + 1;
    }

    public void mostrar() {
        System.out.println("Posición actual: " + this.posicionActual + ", Posición de la bala: " + this.posicionBala);
    }

}



