/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Max
 */
public class Voto {
    
    private Alumno alumnoVotante;
    private ArrayList<Alumno> alumnosVotados;

    public Voto() {
    }

    public Voto(Alumno alumnoVotante, ArrayList<Alumno> alumnosVotados) {
        this.alumnoVotante = alumnoVotante;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumnoVotante() {
        return alumnoVotante;
    }

    public void setAlumnoVotante(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
    }

    public ArrayList<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(ArrayList<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumnoVotante=" + alumnoVotante + ", alumnosVotados=" + alumnosVotados + '}';
    }
    
}
