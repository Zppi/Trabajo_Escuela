import java.util.ArrayList;

public class Alumno {

    public String matricula;
    public String nombre;
    public String apellidopaterno;
    public String apellidomaterno;
    public int numero;
    public String correo;
    public String sexo;
    private ArrayList<Materia> Materias = new ArrayList<>();

    public Alumno(String matricula, String nombre, String apellidopaterno, String apellidomaterno, int numero, String correo, String sexo) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.numero = numero;
        this.correo = correo;
        this.sexo = sexo;
    }

    public void AgregarMateria(Materia materia) {this.Materias.add(materia);}

    @Override
    public String toString() {
        return "matricula: " + matricula + ", nombre: " + nombre + ", apellido paterno: " + apellidopaterno + ", apellido materno: " + apellidomaterno + ", numero: " + numero + ", correo: " + correo + ", sexo: " + sexo;
    }

}
