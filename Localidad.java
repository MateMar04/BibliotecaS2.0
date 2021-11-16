public class Localidad {
    private final String nombre;
    private final Provincia provincia;

    public Localidad(String nombre, Provincia provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    @Override
    public String toString() {
        return nombre + ", " + provincia;
    }
}
