import java.util.ArrayList;

public class Materia {
    public double calificacion;
    public String nombre;
    Profesor profesor;
    private ArrayList<Profesor> profesores = new ArrayList<>();

    public Materia(String nombre,double calificacion, Profesor profesor) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Materia: " +
                "calificacion: " + calificacion +
                ", nombre: " + nombre +
                ", profesor: " + profesor;
    }

}
