import java.util.Random;

class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, char sexo, String asignatura) {
        super(nombre, edad, sexo);
        this.asignatura = asignatura;
    }
    // Getters
    public String mostrarAsignatura() {
        return asignatura;
    }
    // Setters
     public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    
    // metodo para ver si esta disponible
    public boolean estaDisponible() {
        // El profesor tiene un 20% de no estar disponible
        return new Random().nextDouble() > 0.2;
    }
}