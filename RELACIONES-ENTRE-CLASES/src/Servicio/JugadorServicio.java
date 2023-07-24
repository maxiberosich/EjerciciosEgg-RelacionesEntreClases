/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Jugador;
import Entidad.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class JugadorServicio {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public ArrayList<Jugador> crearJugadores(){
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("Cuantos jugadores van a jugar. Maximo 6");
        int j = leer.nextInt();
        for (int i = 0; i < j; i++) {
            Jugador jugador = new Jugador(i+1,"jugador ",false);
            jugadores.add(jugador);
        }
        return jugadores;
    }
    
    /*disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
    
    public boolean disparo(RevolverDeAgua revolver){
        RevolverDeAguaServicio servicioRevolver = new RevolverDeAguaServicio();
        if(!servicioRevolver.mojar(revolver)){
            servicioRevolver.siguienteChorro(revolver);
            return false;
        }
        return true;
     }
}
