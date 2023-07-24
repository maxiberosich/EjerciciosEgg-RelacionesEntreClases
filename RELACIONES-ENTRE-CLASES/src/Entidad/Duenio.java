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
public class Duenio extends Persona{
    private Perro perro;

    public Duenio() {
    }

    public Duenio(Perro perro) {
        this.perro = perro;
    }
    
    public Duenio(String nombre, String apellido, long dni, int edad) {
        super(nombre, apellido, dni, edad);
    }

    public Duenio(Perro perro, String nombre, String apellido, long dni, int edad) {
        super(nombre, apellido, dni, edad);
        this.perro = perro;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Duenio{" + "perro=" + perro + super.toString() + '}';
    }

    
}
