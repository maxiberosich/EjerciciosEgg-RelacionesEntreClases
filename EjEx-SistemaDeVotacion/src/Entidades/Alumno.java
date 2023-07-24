/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author Max
 */
public class Alumno {
    private String nombreCompleto;
    private String dni;
    private int cantidadVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, String dni, int cantidadVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadVotos = cantidadVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    
    
    public static Comparator<Alumno> compararCantidadVotos = new Comparator<Alumno>(){
            @Override
            public int compare(Alumno a1,Alumno a2){
                Integer a1vot = a1.getCantidadVotos(), a2vot  = a2.getCantidadVotos();
                return a2vot.compareTo(a1vot);
            }
            };

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", cantidadVotos=" + cantidadVotos + '}';
    }
    
    
}
