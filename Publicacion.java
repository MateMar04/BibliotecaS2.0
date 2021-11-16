public abstract class Publicacion {
    private final String titulo;
    private final Autor autor;
    private final Editorial editorial;
    private final Categoria categoria;
    private int cantidadPrestamos;

    public Publicacion(String titulo, Autor autor, Editorial editorial, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
    }

    public void incrementarCantPrestamos() {
        cantidadPrestamos++;
    }


    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getCantidadPrestamos() {
        return cantidadPrestamos;
    }

    @Override
    public String toString() {
        return titulo + ", " + autor + ", " + editorial + ", " + categoria + ", " + cantidadPrestamos;
    }
}

