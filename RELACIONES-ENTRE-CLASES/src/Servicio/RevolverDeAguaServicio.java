/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.RevolverDeAgua;

/**
 *
 * @author Max
 */
public class RevolverDeAguaServicio {
    
    /* llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios*/
    public void llenarRevolver(RevolverDeAgua revolver){
        revolver.setPosicionActual((int) (Math.random()*6));
        revolver.setPosicionAgua((int) (Math.random()*6));
        System.out.println(revolver.getPosicionActual());
        System.out.println(revolver.getPosicionAgua());
    }
    
    /*mojar(): devuelve true si la posición del agua coincide con la posición actual*/
    public boolean mojar(RevolverDeAgua revolver){
        return revolver.getPosicionActual() == revolver.getPosicionAgua();
    }
    
    /*siguienteChorro(): cambia a la siguiente posición del tambor*/
    public void siguienteChorro(RevolverDeAgua revolver){
        if(!mojar(revolver)){
            if(revolver.getPosicionActual() == 5){
                revolver.setPosicionActual(0);
            }else{
                revolver.setPosicionActual(revolver.getPosicionActual() + 1);
            }
        }
    }
    
    public void mostrar(RevolverDeAgua revolver){
        System.out.println("Posicion actual del gatillo: " + revolver.getPosicionActual());
        System.out.println("Posicion actual del agua: " + revolver.getPosicionAgua());
    }
    
}
