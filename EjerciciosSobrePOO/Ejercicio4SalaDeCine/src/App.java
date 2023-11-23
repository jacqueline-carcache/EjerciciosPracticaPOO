import java.util.Scanner;

public class App {
     static int intentos = 0;
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        // objeto de pelicula
        Pelicula pelicula = obtenerPelicula(lector);

        if (pelicula != null) {
            SalaCine sala = new SalaCine(pelicula, 10.0, 8, 8);

            // simular 24 espectadores
            sala.simularEspectadores(24);
        } else {
            System.out.println("No se proporcionaron datos válidos. Programa terminado.");
        }

        lector.close();
    }

    private static Pelicula obtenerPelicula(Scanner lector) {
        boolean EntrValida = false;
        Pelicula pelicula = null;

        while (intentos < 3 && !EntrValida) {
            try {
                System.out.print("Introduce el título de la película: ");
                String titulo = lector.nextLine();

                System.out.print("Introduce la duración de la película (en minutos): ");
                int duracion = Integer.parseInt(lector.nextLine());

                System.out.print("Introduce la clasificación de la película: ");
                int clasificacion = Integer.parseInt(lector.nextLine());

                System.out.print("Introduce el director de la película: ");
                String director = lector.nextLine();

                pelicula = new Pelicula(titulo, duracion, clasificacion, director);
                EntrValida = true; // If no exception occurred, input is valid
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa números válidos para la duración y la clasificación.");
                intentos++;
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                intentos++;
            }
        }

        return pelicula;
    }
}

