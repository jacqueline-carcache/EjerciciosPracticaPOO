import java.util.Random;

class SalaCine {

    private Pelicula peliculaEnReproduccion;
    private double precioEntrada;
    private Asiento[][] asientos;

    // Constructor
    public SalaCine(Pelicula pelicula, double precioEntrada, int filas, int columnas) {
        this.peliculaEnReproduccion = pelicula;
        this.precioEntrada = precioEntrada;
        this.asientos = new Asiento[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                this.asientos[i][j] = new Asiento();
            }
        }
    }
    
    // Setters
    public void cambiarPeliculaEnReproduccion(Pelicula peliculaEnReproduccion) {
        this.peliculaEnReproduccion = peliculaEnReproduccion;
    }
    public void cambiarPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
    public void cambiarAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    // Getters
    public Pelicula mostrarPeliculaEnReproduccion() {
        return peliculaEnReproduccion;
    }
    public double mostrarPrecioEntrada() {
        return precioEntrada;
    }
    public Asiento[][] mostrarAsientos() {
        return asientos;
    }

    // Metodos adicionales
    public boolean ocuparAsiento(int fila, int columna) {
        if (fila >= 1 && fila <= asientos.length && columna >= 1 && columna <= asientos[0].length) {
            if (!asientos[asientos.length - fila][columna - 1].ocupado) {
                asientos[asientos.length - fila][columna - 1].ocupado = true;
                return true;
            }
        }
        return false;
    }

    public void simularEspectadores(int cantidadEspectadores) {
        Random rand = new Random();

        for (int i = 0; i < cantidadEspectadores; i++) {
            // Datos aleatorios del espectador y su dinero
            int fila = rand.nextInt(asientos.length) + 1;
            int columna = rand.nextInt(asientos[0].length) + 1;
            int edadEspectador = rand.nextInt(99) + 1; // Edad entre 1 y 99
            double dineroEspectador = rand.nextDouble() * 50; // Dinero entre 0 y 50

            // Verificar si el asiento está ocupado y si el espectador tiene suficiente dinero y la edad adecuada
            if (!asientos[asientos.length - fila][columna - 1].ocupado &&
                dineroEspectador >= precioEntrada &&
                edadEspectador >= peliculaEnReproduccion.mostrarEdadMinima()) {
                // Ocupar el asiento
                ocuparAsiento(fila, columna);
                System.out.println("Espectador sentado en fila " + fila + ", columna " + columna);
            } else {
                System.out.println("Espectador no pudo ser sentado");
            }
        }
    }
}
