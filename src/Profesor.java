public class Profesor {
    public String nombre;
    public int edad;
    public String especialidad;

    public Profesor(String nombre, int edad, String especialidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", edad: " + edad + ", especialidad: '" + especialidad;

    }
}
