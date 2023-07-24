/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11.ejex4;

import Entidades.Alumno;
import Entidades.Simulador;
import Entidades.Voto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia11EjEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        Simulador simu = new Simulador();
        
        System.out.print("Ingrese la cantidad de alumnos que desea crear (Minimo 4): ");
        int cantAlumnos = leer.nextInt();
        while(cantAlumnos < 4){
            System.out.println("4 o Mas");
            cantAlumnos = leer.nextInt();
        }
        
        ArrayList<Alumno> alumnos = simu.crearAlumno(cantAlumnos);
        
        for(Alumno alumno: alumnos){
            System.out.println(alumno);
        }
        
        System.out.println("-----------------------------------");
        System.out.println("Cada alumno tiene 3 votos, el cual puede dar solamente 1 por compañero y " 
                + "no se puede votar a si mismo");
        //simu.votacion(alumnos) recibe la lista de alumnos completa y va mostrando dentro con la
        //funcion votosPorAlumno(), ya que recibe la lista, si se quisiera llamar a la funcion desde
        //el main para que muestre los votos, votacion() deberia recibir un objeto alumno, o sea
        //cada alunno de la lista por separado, al devolver Voto, se puede llamar a la funcion votosPorAlumno
        //desde el main para mostrar cuales alumnos voto cada uno
        simu.votacion(alumnos);
        
        Iterator<Alumno> itVoto = alumnos.iterator();
        
        System.out.println("------------------------------------------");
        System.out.println("RESULTADO FINAL DE LAS VOTACIONES: ");
        
        while (itVoto.hasNext()) {
            Alumno next = itVoto.next();
            System.out.println("# El alumno " + next.getNombreCompleto() + " recibio " + next.getCantidadVotos() 
                    + " votos en total");
        }
        
        System.out.println("------------------------------------------");
        
        System.out.println("La cantidad de votos en total es de: " + simu.cantidadDeVotosEnTotal(alumnos));
        
        System.out.println("------------------------------------------");
        System.out.println("Clasificación General:");
        simu.facilitadores(alumnos);
        
        System.out.println("------------------------------------------");
        System.out.println("Los facilitadores son:");
        for (int i = 0; i < alumnos.size(); i++) {
            if(i > 4){
                System.out.println("Facilitador suplente: " + alumnos.get(i).getNombreCompleto());
            }else
                System.out.println("Facilitador " + (i+1) + " " + alumnos.get(i).getNombreCompleto());
        }
        
        
    }
    
}
