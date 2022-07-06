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

    private static Juego instancia = null;
    
    private int puntos = 0;
    private int problemaActual = 0;
    private ArrayList<Player> posisiones = new ArrayList<>();
    private ArrayList<Problema> problemasDeTipoSeleccion = new ArrayList<>();
    private ArrayList<Problema> ProblemasDeTipoPoner = new ArrayList<>();
    private boolean juegoTerminado = false;
    private int tipoJuego = 0;

    public static Juego getInstancia() {
        if (instancia == null) {
            instancia = new Juego();
        }
        return instancia;
    }

    public Problema nextProblema() {
        ArrayList<Problema> problemas;
        if (tipoJuego == 0) {
            problemas = problemasDeTipoSeleccion;
        } else {
            problemas = ProblemasDeTipoPoner;
        }
        Problema p = problemas.get(problemaActual++);
        if (problemaActual == problemas.size()) {
            juegoTerminado = true;
        }
        return p;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int Puntos) {
        this.puntos = Puntos;
    }

    public ArrayList<Player> getPosisiones() {
        return posisiones;
    }

    public void setPosisiones(ArrayList<Player> Posisiones) {
        this.posisiones = Posisiones;
    }

    public ArrayList<Problema> getProblemasDeTipoSeleccion() {
        return problemasDeTipoSeleccion;
    }

    public void setProblemasDeTipoSeleccion(ArrayList<Problema> ProblemasDeTipoSeleccion) {
        this.problemasDeTipoSeleccion = ProblemasDeTipoSeleccion;
    }

    public ArrayList<Problema> getProblemasDeTipoPoner() {
        return ProblemasDeTipoPoner;
    }

    public void setProblemasDeTipoPoner(ArrayList<Problema> ProblemasDeTipoPoner) {
        this.ProblemasDeTipoPoner = ProblemasDeTipoPoner;
    }

    public void defaultProblemas() {
        for (int i = 0; i < 10; i++) {
            problemasDeTipoSeleccion.add(new Problema());
        }
        for (int i = 0; i < 10; i++) {
            ProblemasDeTipoPoner.add(new Problema());
        }
    }

    public void AgregarProblemaDeSeleccion(int sumando1, char operandor, int sumando2, int respuesta) {
        Problema p = new Problema(sumando1, operandor, sumando2, respuesta);
        problemasDeTipoSeleccion.add(p);
    }

    public void AgregarProblemaDePoner(int sumando1, char operandor, int sumando2, int respuesta) {
        Problema p = new Problema(sumando1, operandor, sumando2, respuesta);
        ProblemasDeTipoPoner.add(p);
    }

    public void AgregarJugador(String nombre, int puntos) {
        Player p = new Player(nombre, puntos);
        posisiones.add(p);
    }

    public void SistemaDePuntos(int n) {
        if (n == 1) {
            puntos += 5;
        }
        if (n == 0) {
            puntos += 2;
        }
    }

    public void RestPuntos() {
        puntos = 0;
    }

}
