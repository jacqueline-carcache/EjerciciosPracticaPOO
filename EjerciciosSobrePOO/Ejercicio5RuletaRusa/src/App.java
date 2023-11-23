import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int intentos = 0;
        Juego juego = null;

        while (intentos < 3 && juego == null) {
            try {
                System.out.print("Introduce el número de jugadores: ");
                int numJugadores = Integer.parseInt(lector.nextLine());
                juego = new Juego(numJugadores);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido para el número de jugadores.");
                intentos++;
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                intentos++;
            }
        }

        if (juego != null) {
            while (!juego.finJuego()) {
                juego.ronda();
            }
        } else {
            System.out.println("No se proporcionó un número válido de jugadores. Programa terminado.");
        }

        lector.close();
    }
}
