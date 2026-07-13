import java.util.ArrayList;

public class Universidad {
    public String nombre;
    Direccion direccion;
    private ArrayList<Grupo> grupos = new ArrayList<>();

    public Universidad(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = new Direccion(direccion.calle, direccion.numerodecalle, direccion.codigopostal);
    }

    public void AgregarGrupos(Grupo grupo) {
        grupos.add(grupo);
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    @Override
    public String toString() {
        return "Universidad: " + "nombre: "+ nombre + ", calle: " + direccion.calle + "numero de calle: " +direccion.numerodecalle + ", codigopostal: " + direccion.codigopostal;
    }

}
