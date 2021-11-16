import java.util.ArrayList;

public class Biblioteca {
    private final String nombre;
    private final ArrayList<Publicacion> listaPublicaciones;
    private final ArrayList<Cliente> listaClientes;
    private final ArrayList<Prestamo> listaPrestamos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.listaPublicaciones = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        this.listaPrestamos = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) {
        listaPublicaciones.add(publicacion);
    }

    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void agregarPrestamo(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
    }

    public int cantidadPublicaciones() {
        return listaPublicaciones.size();
    }

    public int cantidadClientes() {
        return listaClientes.size();
    }

    public int cantidadPrestamos() {
        return listaPrestamos.size();
    }

    public int cantidadLibros() {
        int cantLibros = 0;
        for (Publicacion publicacion : listaPublicaciones) {
            if (publicacion instanceof Libro) {
                cantLibros++;
            }
        }
        return cantLibros;
    }

    public int cantidadRevistas() {
        int cantRevistas = 0;
        for (Publicacion publicacion : listaPublicaciones) {
            if (publicacion instanceof Revista) {
                cantRevistas++;
            }
        }
        return cantRevistas;
    }

    public ArrayList<Publicacion> listarPublicaciones() {
        return listaPublicaciones;
    }

    public ArrayList<Cliente> listarClientes() {
        return listaClientes;
    }

    public ArrayList<Prestamo> listarPrestamos() {
        return listaPrestamos;
    }

    public ArrayList<Cliente> clientesConPrestamoLibro() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        for (Prestamo prestamo : listaPrestamos) {
            for (Publicacion publicacion : prestamo.getListaPublicaionesPrestadas()) {
                if (publicacion instanceof Libro) {
                    clientes.add(prestamo.getCliente());
                    break;
                }
            }
        }
        return clientes;
    }

    public ArrayList<Barrio> barriosConPrestamos() {
        ArrayList<Barrio> barrios = new ArrayList<>();
        for (Prestamo prestamo : listaPrestamos) {
            barrios.add(prestamo.getCliente().getDireccion().getBarrio());
        }
        return barrios;
    }
}
