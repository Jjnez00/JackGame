/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josue
 */
public class Juego {

    private static Juego instancia = null;

    private int puntos = 0;
    private int problemaActual = 0;
    private ArrayList<Player> posisiones = new ArrayList<>();
    private ArrayList<Problema> problemas = new ArrayList<>();
    private ArrayList<Problema> problemasDeTipoSeleccion = new ArrayList<>();
    private ArrayList<Problema> ProblemasDeTipoPoner = new ArrayList<>();
    private boolean juegoTerminado = false;
    private int tipoJuego = 0;
    private String jugadorNombre = "";

    public Juego() {
        cargarProblemas();
        if (problemas.isEmpty()) {
            for (int i = 0; i < 6; i++) {
                problemas.add(new Problema());
            }
            salvarProblemas();
        }
    }
    
    public static Juego getInstancia() {
        if (instancia == null) {
            instancia = new Juego();
        }
        return instancia;
    }
    
    public void cargarProblemas() {
        try ( FileInputStream in = new FileInputStream("problemas.txt");  ObjectInputStream s = new ObjectInputStream(in)) {
            problemas = (ArrayList<Problema>) s.readObject();
        } catch (ClassNotFoundException e) {
        } catch (IOException ex) {
        }
    }
    
    public void salvarProblemas() {
        try ( FileOutputStream f = new FileOutputStream("problemas.txt");  ObjectOutputStream s = new ObjectOutputStream(f)) {
            s.writeObject(problemas);
            s.close();
            f.close();
        } catch (IOException error) {
            error.printStackTrace();
        }
        cargarProblemas();
    }

    public void terminarJuego() {
        Ranking.getInstance().addElemento(jugadorNombre, puntos);
    }
    
    public void iniciarGame() {
        problemaActual = 0;
        juegoTerminado = false;
        
        desordenarArray();
        
        problemasDeTipoSeleccion.clear();
        ProblemasDeTipoPoner.clear();
        for (int i = 0; i < 5; i++) {
            problemasDeTipoSeleccion.add(problemas.get(i));
            ProblemasDeTipoPoner.add(problemas.get(i));
        }
    }
    
    public void desordenarArray() {
        ArrayList<Problema> tmp = new ArrayList<>();
        while(!problemas.isEmpty()) {
            int pos = Problema.getAleatorio(problemas.size());
            tmp.add(problemas.get(pos));
            problemas.remove(pos);
        }
        problemas = tmp;
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

    public int getTipoJuego() {
        return tipoJuego;
    }

    public void setTipoJuego(int tipoJuego) {
        this.tipoJuego = tipoJuego;
    }
    
    
    public int getPuntos() {
        return puntos;
    }

    public String getJugadorNombre() {
        return jugadorNombre;
    }

    public void setJugadorNombre(String jugadorNombre) {
        this.jugadorNombre = jugadorNombre;
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

    public boolean isJuegoTerminado() {
        return juegoTerminado;
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

    public void SistemaDePuntos(int puntosGanados) {
        puntos += puntosGanados;
    }

    public void RestPuntos() {
        puntos = 0;
    }

}
