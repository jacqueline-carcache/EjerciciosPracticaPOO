public class Raices {
    private double a;
    private double b;
    private double c;

    // Constructor
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getters
    public double mostrarA() {
        return a;
    }
    public double mostrarB() {
        return b;
    }
    public double mostrarC() {
        return c;
    }

    // Setters
    public void cambiarA(double a) {
        this.a = a;
    }
    public void cabiarB(double b) {
        this.b = b;
    }
    public void cambiarC(double c) {
        this.c = c;
    }

    // Método para calcular el discriminante
    private double calcularDiscriminante() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    // Método para mostrar el discriminante
    public double mostrarDiscriminante() {
        return calcularDiscriminante();
    }

    // Método para verificar si tiene dos raíces
    public boolean tieneRaices() {
        return calcularDiscriminante() > 0;
    }

    // Método para verificar si tiene una única raíz
    public boolean tieneRaiz() {
        return calcularDiscriminante() == 0;
    }

    // Método para obtener una única raíz
    public void obtenerRaiz() {
        double discriminante = calcularDiscriminante();

        if (tieneRaiz()) {
            double raiz = -this.b / (2 * this.a);
            System.out.println("La única raíz es: " + raiz);
        } else {
            System.out.println("No existe una única raíz real.");
        }
    }

    // Método para obtener las raíces
    public void obtenerRaices() {
        double discriminante = calcularDiscriminante();

        if (tieneRaices()) {
            double raiz1 = (-this.b + Math.sqrt(discriminante)) / (2 * this.a);
            double raiz2 = (-this.b - Math.sqrt(discriminante)) / (2 * this.a);
            System.out.println("Las raíces son: " + raiz1 + " y " + raiz2);
        } else {
            System.out.println("No existen raíces reales.");
        }
    }

}

