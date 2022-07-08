/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Josue
 */
public class Inicio extends javax.swing.JPanel {

    private JPanel c;
    /**
     * Creates new form Init
     */
    private boolean visible = false;

    public Inicio(JPanel c) {
        initComponents();
        this.c = c;

        add.setVisible(false);
        info.setVisible(false);
        sonido.setVisible(false);

        Image("/img/000.png", titulo, 300, 200);
        Image("/img/jugar.png", jugar, 80, 80);
        Image("/img/ranking.png", posisiones, 100, 100);
        Image("/img/salir.png", salir, 50, 50);
        Image("/img/ajuste.png", ajustes, 60, 60);
        Image("/img/add.png", add, 60, 60);
        Image("/img/sonido.png", sonido, 80, 80);
        Image("/img/info.png", info, 50, 50);
        Image("/img/001.png", jack, 400, 400);

        Image("/img/008.png", f1, 300, 80);
        Image("/img/008.png", f2, 300, 80);
        Image("/img/008.png", f3, 150, 50);

        f1.setVisible(false);
        f2.setVisible(false);
        f3.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jugar = new javax.swing.JLabel();
        posisiones = new javax.swing.JLabel();
        ajustes = new javax.swing.JLabel();
        jack = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();
        sonido = new javax.swing.JLabel();
        info = new javax.swing.JLabel();

        setBackground(new java.awt.Color(149, 184, 246));
        setPreferredSize(new java.awt.Dimension(940, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 120, 80));

        salir.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        salir.setText("Salir");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
        });
        add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 150, 60));

        titulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 350, 190));

        jugar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jugar.setForeground(new java.awt.Color(255, 255, 255));
        jugar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jugar.setText("Jugar");
        jugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jugarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jugarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jugarMouseEntered(evt);
            }
        });
        add(jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 250, 60));

        posisiones.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        posisiones.setForeground(new java.awt.Color(255, 255, 255));
        posisiones.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        posisiones.setText("Posiciones");
        posisiones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        posisiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posisionesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                posisionesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                posisionesMouseEntered(evt);
            }
        });
        add(posisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 310, 60));

        ajustes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ajustes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajustesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ajustesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ajustesMouseExited(evt);
            }
        });
        add(ajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 70, 50));

        jack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 370));

        f3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 170, 60));

        f2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(f2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 360, 80));

        f1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 360, 80));

        sonido.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        sonido.setForeground(new java.awt.Color(255, 255, 255));
        sonido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sonido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sonido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sonidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sonidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sonidoMouseExited(evt);
            }
        });
        add(sonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 120, 80));

        info.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        info.setForeground(new java.awt.Color(255, 255, 255));
        info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoMouseExited(evt);
            }
        });
        add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, 120, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salir.setFont(new Font("Arial Rounded MT", Font.BOLD, 24));
        f3.setVisible(true);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salir.setFont(new Font("Arial Rounded MT", Font.BOLD, 18));
        f3.setVisible(false);
    }//GEN-LAST:event_salirMouseExited

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void jugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugarMouseClicked
        Registrar r = new Registrar(c);
        Page(r, c);

    }//GEN-LAST:event_jugarMouseClicked

    private void jugarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugarMouseEntered
        jugar.setFont(new Font("Arial Rounded MT", Font.BOLD, 48));
        f1.setVisible(true);
    }//GEN-LAST:event_jugarMouseEntered

    private void jugarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugarMouseExited
        jugar.setFont(new Font("Arial Rounded MT", Font.BOLD, 36));
        f1.setVisible(false);
    }//GEN-LAST:event_jugarMouseExited

    private void posisionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posisionesMouseClicked
        // TODO add your handling code here:
        ModoRanking m = new ModoRanking(c);
        Page(m, c);
    }//GEN-LAST:event_posisionesMouseClicked

    private void posisionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posisionesMouseEntered
        posisiones.setFont(new Font("Arial Rounded MT", Font.BOLD, 24));
        f2.setVisible(true);
    }//GEN-LAST:event_posisionesMouseEntered

    private void posisionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posisionesMouseExited
        posisiones.setFont(new Font("Arial Rounded MT", Font.BOLD, 18));
        f2.setVisible(false);
    }//GEN-LAST:event_posisionesMouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        Image("/img/add1.png", add, 60, 60);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        Image("/img/add.png", add, 60, 60);
    }//GEN-LAST:event_addMouseExited

    private void ajustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajustesMouseClicked
        if (!visible) {
            add.setVisible(true);
            info.setVisible(true);
            sonido.setVisible(true);
            visible = true;

        } else {
            add.setVisible(false);
            info.setVisible(false);
            sonido.setVisible(false);
            visible = false;
        }
    }//GEN-LAST:event_ajustesMouseClicked

    private void ajustesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajustesMouseEntered
        Image("/img/ajuste1.png", ajustes, 60, 60);
    }//GEN-LAST:event_ajustesMouseEntered

    private void ajustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajustesMouseExited
        Image("/img/ajuste.png", ajustes, 60, 60);
    }//GEN-LAST:event_ajustesMouseExited

    private void sonidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sonidoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sonidoMouseClicked

    private void sonidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sonidoMouseEntered
        Image("/img/sonido1.png", sonido, 80, 80);
    }//GEN-LAST:event_sonidoMouseEntered

    private void sonidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sonidoMouseExited
        Image("/img/sonido.png", sonido, 80, 80);
    }//GEN-LAST:event_sonidoMouseExited

    private void infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_infoMouseClicked

    private void infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseEntered
        Image("/img/info1.png", info, 50, 50);
    }//GEN-LAST:event_infoMouseEntered

    private void infoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseExited
        Image("/img/info.png", info, 50, 50);
    }//GEN-LAST:event_infoMouseExited

    private void Image(String URL, JLabel l, int ancho, int alto) {
        Image j = Toolkit.getDefaultToolkit().getImage(getClass().getResource(URL));
        l.setIcon(new ImageIcon(j.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    }

    private void Page(JPanel i, JPanel c) {
        i.setSize(c.getWidth(), c.getHeight());
        i.setLocation(0, 0);

        c.removeAll();
        c.add(i);
        c.revalidate();
        c.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel ajustes;
    private javax.swing.JLabel f1;
    private javax.swing.JLabel f2;
    private javax.swing.JLabel f3;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jack;
    private javax.swing.JLabel jugar;
    private javax.swing.JLabel posisiones;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel sonido;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
