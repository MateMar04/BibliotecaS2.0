import java.util.ArrayList;

public class Prestamo {
    private final Cliente cliente;
    private final String fechaInicio;
    private final String fechaDevolucion;
    private final ArrayList<Publicacion> listaPublicaionesPrestadas;

    public Prestamo(Cliente cliente, String fechaInicio, String fechaDevolucion) {
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
        this.listaPublicaionesPrestadas = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) {
        listaPublicaionesPrestadas.add(publicacion);
        publicacion.incrementarCantPrestamos();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public ArrayList<Publicacion> getListaPublicaionesPrestadas() {
        return listaPublicaionesPrestadas;
    }


    @Override
    public String toString() {
        return cliente + ", " + fechaInicio + ", " + fechaDevolucion;
    }
}
