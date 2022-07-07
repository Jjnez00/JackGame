package metodos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ranking implements Serializable {

    private static Ranking ranking = null;

    private List<Elemento> elementos = new ArrayList<>();

    public Ranking() {
    }

    public static Ranking getInstance() {
        if (ranking == null) {
            ranking = new Ranking();
        }
        return ranking;
    }

    public void addElemento(String nombre, int puntos) {
        elementos.add(new Elemento(nombre, puntos));
    }

    public void cargarRanking() {
        try ( FileInputStream in = new FileInputStream("ranking.txt");
                ObjectInputStream s = new ObjectInputStream(in)) {
            elementos = (List<Elemento>) s.readObject();
            System.out.println("pepe");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(Ranking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void salvarRanking() {
        try ( FileOutputStream f = new FileOutputStream("ranking.txt");  ObjectOutputStream s = new ObjectOutputStream(f)) {
            s.writeObject(elementos);
            s.close();
            f.close();
        } catch (IOException error) {
            error.printStackTrace();
        }
        cargarRanking();
    }

    public class Elemento implements Serializable {

        private String nombre;
        private int puntos;

        public Elemento(String nombre, int puntos) {
            this.nombre = nombre;
            this.puntos = puntos;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }
    }
}
