public class Direccion {
    private final String calle;
    private final String numero;
    private final Barrio barrio;

    public Direccion(String calle, String numero, Barrio barrio) {
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    @Override
    public String toString() {
        return calle + " " + numero + ", " + barrio;
    }
}
