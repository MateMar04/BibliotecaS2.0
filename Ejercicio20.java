public class Ejercicio20 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Otaku");

        Provincia provincia = new Provincia("Cordoba");
        Provincia provincia2 = new Provincia("Buenos Aires");
        Localidad localidad = new Localidad("Cordoba Capital", provincia);
        Localidad localidad2 = new Localidad("La Plata", provincia2);
        Barrio barrio = new Barrio("Arguello", localidad);
        Barrio barrio2 = new Barrio("Santa Ana", localidad2);
        Direccion direccion = new Direccion("José Roque Funes", "1791", barrio);
        Direccion direccion2 = new Direccion("Av Yirigoyen", "349", barrio2);

        Autor autor = new Autor("Jorge Luis Borges");
        Autor autor2 = new Autor("Julio Cortazar");
        Autor autor3 = new Autor("Billiken");
        Autor autor4 = new Autor("Vogue");
        Editorial editorial = new Editorial("Piedra");
        Editorial editorial2 = new Editorial("Santillana");
        Editorial editorial3 = new Editorial("Atlántida");
        Editorial editorial4 = new Editorial("Condé Nast Publications");
        Categoria categoria = new Categoria("Poesia");
        Categoria categoria2 = new Categoria("Novela");
        Categoria categoria3 = new Categoria("Infantil");
        Categoria categoria4 = new Categoria("Moda");

        Publicacion libro = new Libro("La Biblioteca de Babel", autor, editorial, categoria);
        Publicacion libro2 = new Libro("Casa Tomada", autor2, editorial2, categoria2);
        Publicacion revista = new Revista("Billiken", autor3, editorial3, categoria3);
        Publicacion revista2 = new Revista("Vogue", autor4, editorial4, categoria4);

        Cliente cliente = new Cliente("Juan Perez", "3514569876", "juan.perez@gmail.com", direccion);
        Cliente cliente2 = new Cliente("Pedro Martinez", "3512349876", "pedro.martinez@gmial.com", direccion2);

        Prestamo prestamo = new Prestamo(cliente, "12/12/2012", "01/01/2013");
        Prestamo prestamo2 = new Prestamo(cliente2, "11/11/2012", "12/12/2012");
        Prestamo prestamo3 = new Prestamo(cliente2, "10/10/2012", "11/11/2012");

        biblioteca.agregarPublicacion(libro);
        biblioteca.agregarPublicacion(libro2);
        biblioteca.agregarPublicacion(revista);
        biblioteca.agregarPublicacion(revista2);
        biblioteca.agregarCliente(cliente);
        biblioteca.agregarCliente(cliente2);
        biblioteca.agregarPrestamo(prestamo);
        biblioteca.agregarPrestamo(prestamo2);
        biblioteca.agregarPrestamo(prestamo3);
        prestamo.agregarPublicacion(libro);
        prestamo2.agregarPublicacion(revista);
        prestamo3.agregarPublicacion(revista2);

        System.out.println("Listado de publicaciones: " + biblioteca.listarPublicaciones());
        System.out.println("Cantidad de publicaciones: " + biblioteca.cantidadPublicaciones());
        System.out.println("Cantidad de libros: " + biblioteca.cantidadLibros());
        System.out.println("Cantidad de revistas: " + biblioteca.cantidadRevistas());
        System.out.println("Listado de prestamos: " + biblioteca.listarPrestamos());
        System.out.println("Clientes con prestamos de libros: " + biblioteca.clientesConPrestamoLibro());
        System.out.println("Barrios con prestamos: " + biblioteca.barriosConPrestamos());


    }
}
