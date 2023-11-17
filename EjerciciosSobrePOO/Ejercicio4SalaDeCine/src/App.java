public class App {
    public static void main(String[] args) throws Exception {
         // Crear una película , objeto
         Pelicula pelicula = new Pelicula("La Película", 120, 12, "Director X");

         // Crear una sala de cine , objeto
         SalaCine sala = new SalaCine(pelicula, 10.0, 8, 9);
 
         // Simular 20 espectadores
         sala.simularEspectadores(20);
     }
}
