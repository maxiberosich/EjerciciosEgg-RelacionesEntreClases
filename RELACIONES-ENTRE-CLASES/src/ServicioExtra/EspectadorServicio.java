/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioExtra;

import EntidadExtra.Espectador;

/**
 *
 * @author Max
 */
public class EspectadorServicio {
    
    public Espectador crearEspectador(){
        int edad = (int) (Math.random()*50);
        double dinero = Math.random()*2500;
        return new Espectador("espectador", edad, dinero);
    }
    
}
