/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioExtra;

import EntidadExtra.Cine;
import EntidadExtra.Espectador;

/**
 *
 * @author Max
 */
public class CineServicio {

    public Cine cinePlus() {
        PeliculaServicio ps = new PeliculaServicio();
        EspectadorServicio es = new EspectadorServicio();
        Cine cine = new Cine();
        Espectador[][] espectadores = new Espectador[8][6];
        cine.setPelicula(ps.crearPelicula());

        for (int i = 0; i < 10; i++) {
            Espectador cliente = es.crearEspectador();
            System.out.println(cliente);
            if (cliente.getDinero() >= cine.getPrecioEntrada() && cliente.getEdad() >= cine.getPelicula().getEdadMinima()) {
                int fila = (int) (Math.random() * 8);
                int columna = (int) (Math.random() * 6);
                while (espectadores[fila][columna] != null) {
                    fila = (int) (Math.random() * 8);
                    columna = (int) (Math.random() * 6);                    
                }
                espectadores[fila][columna] = cliente;
            }
        }
        
        cine.setSala(espectadores);
        return cine;
    }

    public void mostrarCine(Cine cine) {
        String[] vector = {"A", "B", "C", "D", "E", "F"};
        System.out.println("La pelicula que esta en esta sala es: " + cine.getPelicula().getTitulo()
                + "\nDura: " + cine.getPelicula().getDuracion());
        System.out.println("El precio de la entrada: " + cine.getPrecioEntrada());
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print((i + 1) + " " + vector[j] + " ");
                if(cine.getSala()[i][j] != null){
                    System.out.print("X " + "|");
                }else{
                    System.out.print("  |");
                }
                
            }
            System.out.println("");
        }
    }

}
