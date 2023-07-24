/*
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Servicio;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Max
 */
public class BarajaServicio {

    public void barajar(Baraja baraja) {
        Collections.shuffle(baraja.getMazo());
    }

    public Carta siguienteCarta(Baraja baraja) {
        if (!baraja.getMazo().isEmpty()) {
            Carta carta = baraja.getMazo().get(0);
            baraja.getMazo().remove(0);
            return carta;
        } else {
            System.out.println("Nos quedamos sin cartas papu");
            return null;
        }
    }

    public int cartasDisponibles(Baraja baraja) {
        return baraja.getMazo().size();
    }

    public ArrayList<Carta> darCartas(Baraja baraja, int cantidadCartas, Baraja salida) {
        ArrayList<Carta> cartas = new ArrayList<>();
        if (cartasDisponibles(baraja) >= cantidadCartas) {
            for (int i = 0; i < cantidadCartas; i++) {
                Carta carta = siguienteCarta(baraja);
                cartas.add(carta);
            }
        }else{
            System.out.println("No hay cartas suficientes");
        }
        cartasMonton(cartas,salida);
        return cartas;
    }
    
    public void cartasMonton(ArrayList<Carta> baraja, Baraja monton){
        for(Carta car: baraja){
            monton.getMazo().add(car);
        }
    }
    
    public void mostrar(Baraja baraja){
        for(Carta carta: baraja.getMazo()){
            System.out.println(carta +"");
        }
    }

}
