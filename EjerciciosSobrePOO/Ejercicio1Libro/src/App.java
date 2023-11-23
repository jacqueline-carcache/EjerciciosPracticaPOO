import java.util.Scanner;

public class App {
    static int intentos = 0;
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        Libro libro1 = obtenerLibro(lector);
        Libro libro2 = obtenerLibro(lector);

        // Mostrar la información de los libros
        if (libro1 != null && libro2 != null) {
            libro1.MostrarInformacion();
            libro2.MostrarInformacion();

            // Comparar el número de páginas entre los dos libros
            Libro libroConMasPaginas = Libro.compararPaginas(libro1, libro2);

            if (libroConMasPaginas != null) {
                System.out.println("El libro con más páginas es: '" + libroConMasPaginas.mostrarTitulo() + "'");
            } else {
                System.out.println("Ambos libros tienen el mismo número de páginas.");
            }
        } else {
            System.out.println("No se proporcionaron datos válidos. Programa terminado.");
        }

        lector.close();
    }

    private static Libro obtenerLibro(Scanner lector) {
        boolean EntrValida = false;
        Libro libro = null;

        while (intentos < 3 && !EntrValida) {
            try {
                System.out.print("Introduce el ISBN del libro: ");
                String isbn =lector.nextLine();

                System.out.print("Introduce el título del libro: ");
                String titulo =lector.nextLine();

                System.out.print("Introduce el autor del libro: ");
                String autor =lector.nextLine();

                System.out.print("Introduce el número de páginas del libro: ");
                int numPaginas = Integer.parseInt(lector.nextLine());

                libro = new Libro(isbn, titulo, autor, numPaginas);
                EntrValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido para el número de páginas.");
                intentos++;
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                intentos++;
            }
        }

        return libro;
    }
}
