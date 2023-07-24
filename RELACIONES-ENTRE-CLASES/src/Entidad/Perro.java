/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Max
 */
public class Perro {
    private String nombreMascota;
    private String raza;
    private int edadMascota;
    private double tamanio;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, double tamanio) {
        this.nombreMascota = nombre;
        this.raza = raza;
        this.edadMascota = edad;
        this.tamanio = tamanio;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombre) {
        this.nombreMascota = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edad) {
        this.edadMascota = edad;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombreMascota=" + nombreMascota + ", raza=" + raza + ", edadMascota=" + edadMascota + ", tamanio=" + tamanio + '}';
    }
    
    
    
}
