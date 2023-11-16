public class Libro {
        private String ISBN;
        private String titulo;
        private String autor;
        private int numPaginas;
    
        // Constructor
        public Libro(String ISBN, String titulo, String autor, int numPaginas) {
            this.ISBN = ISBN;
            this.titulo = titulo;
            this.autor = autor;
            this.numPaginas = numPaginas;
        }
    
        // Getters 
        public String mostrarISBN() {
            return ISBN;
        }
        public String mostrarTitulo() {
            return titulo;
        }
        public String mostrarAutor() {
            return autor;
        }
        public int mostrarNumPaginas() {
            return numPaginas;
        }

        // Setters
        public void cambiarISBN(String ISBN) {
           this.ISBN = ISBN ;
        }

        public void cambiarTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void cambiarAutor(String autor) {
            this.autor = autor;
        }

        public void cambiarNumPaginas(int numPaginas) {
            this.numPaginas = numPaginas;
        }
       
        // Método para mostrar la información del libro
        public void MostrarInformacion() {
            System.out.println("El libro '" + this.titulo + "' con ISBN " + this.ISBN +
                    " creado por el autor " + this.autor + " tiene " + this.numPaginas + " páginas.");
        }

        // Método para comparar el número de páginas entre dos libros
        public static Libro compararPaginas(Libro libro1, Libro libro2) {
            if (libro1.mostrarNumPaginas() > libro2.mostrarNumPaginas()) {
                return libro1;
            } else if (libro1.mostrarNumPaginas() < libro2.mostrarNumPaginas()) {
                return libro2;
            } else {
                return null; // Ambos tienen el mismo número de páginas
            }
        }
}
