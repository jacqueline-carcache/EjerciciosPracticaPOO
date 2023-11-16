public class App {
    public static void main(String[] args) throws Exception {
        // Crear objetos Libro
        Libro libro1 = new Libro("123456789", "Don Quijote de la Mancha", "Miguel de Cervantes", 863);
        Libro libro2 = new Libro("987654321", "Cien años de soledad", "Gabriel García Márquez", 417);

        // Mostrar la información de los libros
        libro1.MostrarInformacion();
        libro2.MostrarInformacion();

        // Comparar el número de páginas entre los dos libros
        Libro libroConMasPaginas = Libro.compararPaginas(libro1, libro2);

        if (libroConMasPaginas != null) {
            System.out.println("El libro con más páginas es: '" + libroConMasPaginas.mostrarTitulo() + "'");
        } else {
            System.out.println("Ambos libros tienen el mismo número de páginas.");
        }
    }
}
