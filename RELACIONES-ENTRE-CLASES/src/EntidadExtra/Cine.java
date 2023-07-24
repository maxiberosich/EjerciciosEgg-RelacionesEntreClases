/*
interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.
 */
package EntidadExtra;

/**
 *
 * @author Max
 */
public class Cine {
    
    private Pelicula pelicula;
    private Espectador[][] sala;
    private double precioEntrada;

    public Cine() {
        this.precioEntrada = 1200;
    }

    public Cine(Pelicula pelicula, Espectador[][] sala, double precioEntrada) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Espectador[][] getSala() {
        return sala;
    }

    public void setSala(Espectador[][] sala) {
        this.sala = sala;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", sala=" + sala + ", precioEntrada=" + precioEntrada + '}';
    }
    
    
    
}
