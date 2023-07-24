/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enumeraciones.EnumApellido;
import Enumeraciones.EnumNombre;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Max
 */
public class Simulador {

    private ArrayList<String> nombrarAlumno(int cant) {
        ArrayList<String> alumnos = new ArrayList();
        for (int i = 0; i < cant; i++) {
            String nombre = randomnombre().toString().concat(" " + randomapellido().toString());
            alumnos.add(nombre);
        }
        return alumnos;
    }

    private EnumNombre randomnombre() {

        int pos = new Random().nextInt(EnumNombre.values().length);
        return EnumNombre.values()[pos];

    }

    private EnumApellido randomapellido() {
        int pos = new Random().nextInt(EnumApellido.values().length);
        return EnumApellido.values()[pos];
    }

    private ArrayList<String> generarDNI(int cant) {
        ArrayList<String> dn = new ArrayList();
        for (int i = 0; i < cant; i++) {
            long num = (long) (Math.random() * (100000000));
            String dni = "" + num;
            while (dn.contains(dni)) {
                num = (long) (Math.random() * (100000000));
                dni = "" + num;
            }
            dn.add(dni);
        }

        return dn;

    }

    public ArrayList<Alumno> crearAlumno(int cantidad) {
        ArrayList<Alumno> alumnos = new ArrayList();
        ArrayList<String> documento = generarDNI(cantidad);
        ArrayList<String> nombre = nombrarAlumno(cantidad);

        Iterator<String> itD = documento.iterator();
        Iterator<String> itN = nombre.iterator();

        while (itD.hasNext() && itN.hasNext()) {
            String dni = itD.next(), nom = itN.next();
            Alumno alumno = new Alumno();
            alumno.setNombreCompleto(nom);
            alumno.setDni(dni);
            alumnos.add(alumno);
        }

        return alumnos;
    }

    /*Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos 
    *para cada alumno genera tres votos de manera aleatoria.
    *En este método debemos guardar a el alumno que vota, a los alumnos a los que votó y 
    sumarle uno a la cantidad de votos a cada alumno que reciba un votoListaAlumnos, que es un atributo 
    de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto*/
    public Voto votacion(ArrayList<Alumno> alumnos) {
        Voto votos = new Voto();

        ArrayList<Alumno> votoListaAlumnos = alumnos;

        for (Alumno estudiante : alumnos) {
            ArrayList<Alumno> listaVotos = new ArrayList();
            votos.setAlumnoVotante(estudiante);
            listaVotos.add(estudiante);
            
            while (listaVotos.size() < 4) {

                Alumno al = alumnos.get((int) (Math.random() * votoListaAlumnos.size()));

                while (listaVotos.contains(al)) {
                    al = alumnos.get((int) (Math.random() * votoListaAlumnos.size()));

                }
                al.setCantidadVotos(al.getCantidadVotos() + 1);
                listaVotos.add(al);

            }
            votos.setAlumnosVotados(listaVotos);
            votosPorAlumno(votos);
        }
        return votos;
    }
    
    public void votosPorAlumno(Voto voto){
        System.out.println(voto.getAlumnoVotante().getNombreCompleto() + " voto a:");
        for(Alumno al: voto.getAlumnosVotados()){
            if(al != voto.getAlumnoVotante()){
                System.out.println(" *" + al.getNombreCompleto());
            }            
        }
    }

    public int cantidadDeVotosEnTotal(ArrayList<Alumno> alumnos){
        int sumaVotos = 0;
        for (Alumno al: alumnos){
            sumaVotos += al.getCantidadVotos();
        }
        return sumaVotos;
    }
    
    public void facilitadores(ArrayList<Alumno> alumnos){
        Collections.sort(alumnos, Alumno.compararCantidadVotos);
        int i = 1;
        for(Alumno al: alumnos){
            System.out.println(i + "º con " + al.getCantidadVotos() + " votos " + al.getNombreCompleto());
            i++;
        }
    }

}
