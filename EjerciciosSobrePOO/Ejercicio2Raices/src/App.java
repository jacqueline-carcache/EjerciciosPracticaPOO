public class App {
    public static void main(String[] args) throws Exception {
       // Crear objeto Raices con coeficientes
       Raices ecuacion = new Raices(1, -3, 2);

       // Mostrar información sobre las raíces
       ecuacion.obtenerRaices();
       ecuacion.obtenerRaiz();
       System.out.println("El discriminante es: " + ecuacion.mostrarDiscriminante());
    }
}
