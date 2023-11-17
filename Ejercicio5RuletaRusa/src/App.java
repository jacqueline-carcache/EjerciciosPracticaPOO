public class App {
    public static void main(String[] args) throws Exception {
          // Puedes ajustar el número de jugadores aquí.
          Juego juego = new Juego(4);

          while (!juego.finJuego()) {
              juego.ronda();
          }
    }
}
