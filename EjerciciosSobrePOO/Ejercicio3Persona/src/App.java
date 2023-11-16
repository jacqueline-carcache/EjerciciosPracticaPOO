public class App {
    public static void main(String[] args) throws Exception {
        // Crear profesor y aula
        Profesor profesor = new Profesor("Profesor1", 35, 'M', "Introducción a la programación");
        Aula aula = new Aula(1, 30, "Introducción a la programación", profesor);

        // Crear estudiantes y agregarlos al aula
        for (int i = 1; i <= 30; i++) {
            char sexo = i % 2 == 0 ? 'M' : 'F';
            Estudiante estudiante = new Estudiante("Estudiante" + i, 20 + i, sexo, Math.random() * 10);
            aula.agregarEstudiante(estudiante);
        }

        // Verificar si se puede dar clase
        if (aula.puedeDarClase()) {
            System.out.println("Se puede dar clase en el aula " + aula.mostrarId());
            aula.mostrarAprobados();
        } else {
            System.out.println("No se puede dar clase en el aula " + aula.mostrarId());
        }
    }
}
