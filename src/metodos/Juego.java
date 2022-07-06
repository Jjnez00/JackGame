/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.ArrayList;

/**
 *
 * @author Josue
 */
public class Juego {

    private  static int Puntos = 0;
    private  static ArrayList<Player> Posisiones= new ArrayList<Player>();
    private  static ArrayList<ListaDeProblemas> ProblemasDeTipoSeleccion=new ArrayList<ListaDeProblemas>();

    public static int getPuntos() {
        return Puntos;
    }

    public static void setPuntos(int Puntos) {
        Juego.Puntos = Puntos;
    }

    public static ArrayList<Player> getPosisiones() {
        return Posisiones;
    }

    public static void setPosisiones(ArrayList<Player> Posisiones) {
        Juego.Posisiones = Posisiones;
    }

    public static ArrayList<ListaDeProblemas> getProblemasDeTipoSeleccion() {
        return ProblemasDeTipoSeleccion;
    }

    public static void setProblemasDeTipoSeleccion(ArrayList<ListaDeProblemas> ProblemasDeTipoSeleccion) {
        Juego.ProblemasDeTipoSeleccion = ProblemasDeTipoSeleccion;
    }

    public static ArrayList<ListaDeProblemas> getProblemasDeTipoPoner() {
        return ProblemasDeTipoPoner;
    }

    public static void setProblemasDeTipoPoner(ArrayList<ListaDeProblemas> ProblemasDeTipoPoner) {
        Juego.ProblemasDeTipoPoner = ProblemasDeTipoPoner;
    }
    private  static ArrayList<ListaDeProblemas> ProblemasDeTipoPoner=new ArrayList<ListaDeProblemas>();

    private int[] sumandoSeleccion1 = new int[]{
      4,10,7,15,20,8,79,63,38,7
    };
    private int[] sumandoSeleccion2 = new int[]{
    3,5,32,3,13,6,15,7,16,6
    };
    private int[] respuestaSeleccion = new int[]{
    1,50,39,5,7,48,94,9,22,42
    };
    private char[] operadorSeleccion = new char[]{
     '-','*','+','/','-','*','+','/','-','*'
    };
    private int[] sumandoPoner1 = new int[]{
      11,4,21,43,86,5,31,18,94,8
    };
    private int[] sumandoPoner2 = new int[]{
    8,3,3,32,45,4,19,3,71,9
    };
    private int[] respuestaPoner = new int[]{
    3,12,7,75,41,20,50,6,23,81
    };
    private char[] operadorPoner = new char[]{
     '-','*','/','+','-','*','+','/','-','*'
    };
    public void DefaultProblemas() {
        for (int i = 0; i < 10; i++) {
            ListaDeProblemas p = new ListaDeProblemas(sumandoSeleccion1[i], operadorSeleccion[i], sumandoSeleccion2[i], respuestaSeleccion[i]);
            ProblemasDeTipoSeleccion.add(p);
            
        }
        for (int i = 0; i < 10; i++) {
            ListaDeProblemas p = new ListaDeProblemas(sumandoPoner1[i], operadorPoner[i], sumandoPoner2[i], respuestaPoner[i]);
            ProblemasDeTipoPoner.add(p);
        }
    }

    public void AgregarProblemaDeSeleccion(int sumando1, char operandor, int sumando2, int respuesta) {
        ListaDeProblemas p = new ListaDeProblemas(sumando1, operandor, sumando2, respuesta);
        ProblemasDeTipoSeleccion.add(p);
    }

    public void AgregarProblemaDePoner(int sumando1, char operandor, int sumando2, int respuesta) {
        ListaDeProblemas p = new ListaDeProblemas(sumando1, operandor, sumando2, respuesta);
        ProblemasDeTipoPoner.add(p);
    }
    
    public void AgregarJugador(String nombre , int puntos){
        Player p = new Player(nombre, puntos);
        Posisiones.add(p);
    }

    public void SistemaDePuntos(int n) {
        if (n == 1) {
            Puntos += 5;
        }
        if (n == 0) {
            Puntos += 2;
        }
    }

    public void RestPuntos() {
        Puntos = 0;
    }

}
