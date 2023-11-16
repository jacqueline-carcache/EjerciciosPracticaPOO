import java.util.ArrayList;
import java.util.List;

class Aula {
    private int id;
    private int maxEstudiantes;
    private String asignatura;
    private Profesor profesor;
    private List<Estudiante> estudiantes = new ArrayList<>();

     // Constructor
    public Aula(int id, int maxEstudiantes, String asignatura, Profesor profesor) {
        this.id = id;
        this.maxEstudiantes = maxEstudiantes;
        this.asignatura = asignatura;
        this.profesor = profesor;
    }
    
    // Setters
    public void cambiarId(int id) {
        this.id = id;
    }
    public void cambiarMaxEstudiantes(int maxEstudiantes) {
        this.maxEstudiantes = maxEstudiantes;
    }
    public void cambiarAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    public void cambiarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public void cambiarEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

     // Getters
    public int mostrarId() {
        return id;
    }
    public int mostrarMaxEstudiantes() {
        return maxEstudiantes;
    }
    public String mostrarAsignatura() {
        return asignatura;
    }
    public Profesor mostrarProfesor() {
        return profesor;
    }

    // metodo para agregar estudiante
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    // metodo para dar clase
    public boolean puedeDarClase() {
        // Verificar condiciones para dar clase
        return profesor.estaDisponible() && asignatura.equals(profesor.mostrarAsignatura())
                && estudiantes.size() > 0.5 * maxEstudiantes;
    }
    // metodo para mostrar aprobados
    public void mostrarAprobados() {
        int aprobadosHombres = 0;
        int aprobadasMujeres = 0;

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.mostrarCalificacion() >= 5) {
                if (estudiante.mostrarSexo() == 'M') {
                    aprobadasMujeres++;
                } else {
                    aprobadosHombres++;
                }
            }
        }

        System.out.println("Aprobados en el aula " + id + ":");
        System.out.println("Hombres: " + aprobadosHombres);
        System.out.println("Mujeres: " + aprobadasMujeres);
    }
}
