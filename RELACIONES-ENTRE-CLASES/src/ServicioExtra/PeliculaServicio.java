/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioExtra;

import EntidadExtra.Pelicula;

/**
 *
 * @author Max
 */
public class PeliculaServicio {
    
    public Pelicula crearPelicula(){
        double duracion = Math.random()*3+1;
        int edad = (int) (Math.random()*50);
        return new Pelicula("peli", duracion, 18, "dire");
    }
    
}
