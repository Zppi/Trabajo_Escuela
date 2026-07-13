import java.util.ArrayList;

public class Grupo {
    public int grado;
    public char seccion;
    public String turno;
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public Grupo(int grado, char seccion, String turno) {
        this.grado = grado;
        this.seccion = seccion;
        this.turno = turno;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    @Override
    public String toString() {
        return  "grado: " + grado + ", seccion: " + seccion + ", turno: " + turno;
    }

}
