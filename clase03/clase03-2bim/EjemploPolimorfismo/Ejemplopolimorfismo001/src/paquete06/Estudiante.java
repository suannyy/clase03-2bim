package paquete06;

public abstract class Estudiante {
    protected String nombres;
    protected String apellidos;
    protected String identificacion;
    protected int edad;
    protected double matricula;

    public void establecerNombresEstudiante(String nombres) {
        this.nombres = nombres;
    }

    public void establecerApellidoEstudiante(String apellidos) {
        this.apellidos = apellidos;
    }

    public void establecerIdentificacionEstudiante(String identificacion) {
        this.identificacion = identificacion;
    }

    public void establecerEdadEstudiante(int edad) {
        this.edad = edad;
    }

    public abstract void calcularMatricula();

    @Override
    public String toString() {
        return String.format("Nombre: %s\nApellidos: %s\nIdentificación: %s\nEdad: %d\nMatrícula: %.2f\n", 
                             nombres, apellidos, identificacion, edad, matricula);
    }
}
