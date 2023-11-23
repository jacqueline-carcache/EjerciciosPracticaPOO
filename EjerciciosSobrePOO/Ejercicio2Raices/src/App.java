import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int intentos = 0;
        boolean EntrValida = false;
        Scanner lector = new Scanner(System.in);

        while (intentos < 3 && !EntrValida) {
            try {
                System.out.print("Introduce el coeficiente a: ");
                double a = Double.parseDouble(lector.nextLine());

                System.out.print("Introduce el coeficiente b: ");
                double b = Double.parseDouble(lector.nextLine());

                System.out.print("Introduce el coeficiente c: ");
                double c = Double.parseDouble(lector.nextLine());

                // Crear objeto Raices 
                Raices ecuacion = new Raices(a, b, c);

                // Mostrar información sobre las raíces
                ecuacion.obtenerRaices();
                ecuacion.obtenerRaiz();
                System.out.println("El discriminante es: " + ecuacion.mostrarDiscriminante());
                EntrValida = true; 
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido.");
                intentos++;
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                intentos++;
            }
        }

        if (!EntrValida) {
            System.out.println("Has agotado tus 3 intentos. Programa terminado.");
        } else {
            System.out.println("Programa terminado con éxito.");
        }

        lector.close();
    }
}
