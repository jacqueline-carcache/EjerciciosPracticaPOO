import java.util.HashSet;
import java.util.Set;

public class Juego {
    private Set<Jugador> jugadores;
    private Revolver revolver;

    public Juego(int numJugadores) {
        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6; // Por defecto, si el número de jugadores no está en el rango 1-6.
        }

        this.jugadores = new HashSet<>();
        for (int i = 1; i <= numJugadores; i++) {
            this.jugadores.add(new Jugador(i));
        }

        this.revolver = new Revolver();
    }

    public boolean finJuego() {
        for (Jugador jugador : this.jugadores) {
            if (!jugador.estaVivo()) {
                return true;
            }
        }
        return false;
    }
    
    public void ronda() {
        for (Jugador jugador : this.jugadores) {
            if (jugador.estaVivo()) {
                jugador.disparar(this.revolver);
                if (this.finJuego()) {
                    System.out.println("¡El juego ha terminado!");
                    return;
                }
                this.revolver.siguienteBala();
                this.revolver.mostrar();
                System.out.println();
            }
        }
    }
}
