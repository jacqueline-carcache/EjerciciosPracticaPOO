import java.util.Random;

class Estudiante extends Persona {
    private double calificacion;
     
    //Constructor
    public Estudiante(String nombre, int edad, char sexo, double calificacion) {
        super(nombre, edad, sexo);
        this.calificacion = calificacion;
    }
    // Getters
    public double mostrarCalificacion() {
        return calificacion;
    }
    //setters
    public void cambiarCalificacion( double calificacion) {
        this.calificacion = calificacion;
    }
    // metodo para la asistencia
    public boolean puedeAsistir() {
        // Los estudiantes pueden faltar hasta un 50% de las clases
        return new Random().nextDouble() <= 0.5;
    }
    
}
