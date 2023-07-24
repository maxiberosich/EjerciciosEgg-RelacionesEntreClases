/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package guia11;

import Entidad.Baraja;
import Entidad.Carta;
import Entidad.Duenio;
import Entidad.Jugador;
import Entidad.Perro;
import Entidad.RevolverDeAgua;
import EntidadExtra.Cine;
import Servicio.BarajaServicio;
import Servicio.JuegoServicio;
import Servicio.JugadorServicio;
import ServicioExtra.CineServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        /*ArrayList<Jugador> jugadores = new ArrayList();
        RevolverDeAgua revolver = new RevolverDeAgua();
        
        JuegoServicio js = new JuegoServicio();
        js.ronda(js.llenarJuego(jugadores, revolver));*/
        
        //EJERCICIO 3 - CARTAS
        /*BarajaServicio bs = new BarajaServicio();
        Baraja mazo = new Baraja();
        Baraja monton = new Baraja();
        
        bs.barajar(mazo);
        
        monton.setMazo(new ArrayList<Carta>());
        boolean continuar;
        do {            
            System.out.println("Cartas que desea");
            int cant = leer.nextInt();
            System.out.println(bs.darCartas(mazo, cant, monton));
            System.out.println("Quieres otra carta");
            continuar = true;
            int num = leer.nextInt();
            if(num != 1){
                continuar=false;
            }
        } while (continuar);*/
        
        
        CineServicio cs = new CineServicio();
        
        cs.mostrarCine(cs.cinePlus());

    }
    
}

    
