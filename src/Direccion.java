public class Direccion {
    public String calle;
    public int numerodecalle;
    public int codigopostal;

    public Direccion(String calle, int numerodecalle, int codigopostal) {
        this.calle = calle;
        this.numerodecalle = numerodecalle;
        this.codigopostal = codigopostal;
    }

    @Override
    public String toString() {
        return "calle: " + calle + ", numerodecalle: " + numerodecalle + ", codigopostal: " + codigopostal;
    }

}
