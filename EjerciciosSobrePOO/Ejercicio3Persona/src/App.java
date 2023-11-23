import java.util.Scanner;

public class App {
    static int intentos = 0;
    public static void main(String[] args) throws Exception {
        
        Scanner lector = new Scanner(System.in);

        Profesor profesor = obtenerProfesor(lector);
        Aula aula = obtenerAula(lector, profesor);

        if (aula != null) {
           
            for (int i = 1; i <= 30; i++) {
                char sexo = i % 2 == 0 ? 'M' : 'F';
                Estudiante estudiante = obtenerEstudiante(lector, i, sexo);
                aula.agregarEstudiante(estudiante);
            }
 
            if (aula.puedeDarClase()) {
                System.out.println("Se puede dar clase en el aula " + aula.mostrarId());
                aula.mostrarAprobados();
            } else {
                System.out.println("No se puede dar clase en el aula " + aula.mostrarId());
            }
        } else {
            System.out.println("No se proporcionaron datos válidos. Programa terminado.");
        } 
    }

    private static Profesor obtenerProfesor(Scanner lector) {
        boolean EntrValida = false;
        Profesor profesor = null;

        while (intentos < 3 && !EntrValida) {
            try {
                System.out.print("Introduce el nombre del profesor: ");
                String nombre = lector.nextLine();

                System.out.print("Introduce la edad del profesor: ");
                int edad = Integer.parseInt(lector.nextLine());

                System.out.print("Introduce el sexo del profesor (M/F): ");
                char sexo = lector.nextLine().charAt(0);

                System.out.print("Introduce la materia que imparte el profesor: ");
                String materia = lector.nextLine();

                profesor = new Profesor(nombre, edad, sexo, materia);
                EntrValida = true; 
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido para la edad.");
                intentos++;
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                intentos++;
            }
        }

        return profesor;
    }

    private static Aula obtenerAula(Scanner lector, Profesor profesor) {
        boolean EntrValida = false;
        Aula aula = null;

        while (intentos < 3 && !EntrValida) {
            try {
                System.out.print("Introduce el número de aula: ");
                int numeroAula = Integer.parseInt(lector.nextLine());

                System.out.print("Introduce la capacidad del aula: ");
                int capacidad = Integer.parseInt(lector.nextLine());

                System.out.print("Introduce el nombre de la materia que se imparte en el aula: ");
                String materiaAula = lector.nextLine();

                aula = new Aula(numeroAula, capacidad, materiaAula, profesor);
                EntrValida = true; 
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido para el número de aula y la capacidad.");
                intentos++;
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                intentos++;
            }
        }

        return aula;
    }

    private static Estudiante obtenerEstudiante(Scanner lector, int index, char sexo) {
        boolean EntrValida = false;
        Estudiante estudiante = null;

        while (intentos < 3 && !EntrValida) {
            try {
                System.out.print("Introduce el nombre del estudiante " + index + ": ");
                String nombre = lector.nextLine();

                System.out.print("Introduce la edad del estudiante " + index + ": ");
                int edad = Integer.parseInt(lector.nextLine());

                System.out.print("Introduce la calificación del estudiante " + index + ": ");
                double calificacion = Double.parseDouble(lector.nextLine());

                estudiante = new Estudiante(nombre, edad, sexo, calificacion);
                EntrValida = true; 
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido para la edad y la calificación.");
                intentos++;
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                intentos++;
            }
        }

        return estudiante;
    }
}
