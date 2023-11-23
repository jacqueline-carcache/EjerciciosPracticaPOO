class Persona {
    
    private String nombre;
    private int edad;
    private char sexo;

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    // Getters
    public String mostrarNombre() {
        return nombre;
    }
    public int mostrarEdad() {
        return edad;
    }
    public char mostrarSexo() {
        return sexo;
    }

    // Setters
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }
    public void cambiarEdad(int edad) {
        this.edad = edad;
    }
    public void cambiarSexo(char sexo) {
        this.sexo = sexo;
    }
    
}
