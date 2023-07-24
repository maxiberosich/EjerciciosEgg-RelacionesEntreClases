/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Max
 */
public class JuegoServicio {

    /*llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.*/
    public Juego llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        JugadorServicio js = new JugadorServicio();
        jugadores = js.crearJugadores();
        
        RevolverDeAguaServicio revolverS = new RevolverDeAguaServicio();
        revolverS.llenarRevolver(revolver);
        
        return new Juego(jugadores, revolver);
    }

    /*ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.*/
    public void ronda(Juego juego) {
        RevolverDeAguaServicio revolverS = new RevolverDeAguaServicio();
        Iterator<Jugador> it = juego.getJugadores().listIterator();

        while (it.hasNext()) {
            Jugador jugador = it.next();
            if (!revolverS.mojar(juego.getRevolver())) {
                if (jugador.isMojado() != true) {
                    revolverS.siguienteChorro(juego.getRevolver());
                    System.out.println("Sigue seco chamigo " + jugador.getNombre());
                }
            } else {
                jugador.setMojado(true);
                System.out.println("Estas mojado " + jugador.getNombre());
                break;
            }
            if(!it.hasNext()){
                it = juego.getJugadores().listIterator(0);
            }
        }

    }

}
