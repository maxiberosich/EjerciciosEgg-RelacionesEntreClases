/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Max
 */
public class Baraja {
    private ArrayList<Carta> mazo;

    public Baraja() {
        mazo = new ArrayList();
        String[] palos = {"oro","espada","basto","copa"};
        for (String palo: palos) {
            for (int i = 1; i <= 12; i++) {
                if(i != 8 && i != 9){
                    Carta carta = new Carta(i,palo);
                    mazo.add(carta);
                }
            }
        }
    }

    public Baraja(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }
    

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + '}';
    }
    
    
    
}
