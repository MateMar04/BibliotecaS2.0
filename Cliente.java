public class Cliente {
    private final String nombre;
    private final String telefono;
    private final String email;
    private final Direccion direccion;

    public Cliente(String nombre, String telefono, String email, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return nombre + ", " + telefono + ", " + email + ", " + direccion;
    }
}
