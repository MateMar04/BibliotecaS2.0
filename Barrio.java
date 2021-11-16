public class Barrio {
    private final String nombre;
    private final Localidad localidad;

    public Barrio(String nombre, Localidad localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    @Override
    public String toString() {
        return nombre + ", " + localidad;
    }
}
