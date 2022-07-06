/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.interfaz;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 
 */
public class Acierto extends javax.swing.JPanel {

    /**
     * Creates new form Acierto
     */
    private JPanel c;
    
    
    public Acierto(JPanel c) {
        initComponents();
        this.c=c;
        
          Image("/img/004.png", jack, 700, 500);
          Image("/img/008.png", continuar, 210, 60);
        
    }
      
    
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        continuar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jack = new javax.swing.JLabel();

        setBackground(new java.awt.Color(149, 184, 246));
        setLayout(new AbsoluteLayout());

        continuar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        continuar.setForeground(new java.awt.Color(255, 255, 255));
        continuar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        continuar.setText("Continuar");
        continuar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                continuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                continuarMouseExited(evt);
            }
        });
        add(continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 330, 150));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 95, 73));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Felicitaciones");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Respuesta Correcta");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, 50));

        jack.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jack.setForeground(new java.awt.Color(250, 95, 73));
        jack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 460));
    }// </editor-fold>//GEN-END:initComponents


    private void setLayout(AbsoluteLayout absoluteLayout) {
    }


    private void extracted() {
        continuar.setForeground(new java.awt.Color(255, 255, 255));
    }

    private void continuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarMouseEntered
        continuar.setFont(new Font("Arial Rounded MT", Font.BOLD, 48));
        Image("/img/008.png", continuar, 300, 90);
        
    }//GEN-LAST:event_continuarMouseEntered

    private void continuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarMouseExited
        continuar.setFont(new Font("Arial Rounded MT", Font.BOLD, 36));
        Image("/img/008.png", continuar, 210, 60);
    }//GEN-LAST:event_continuarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel continuar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jack;
    // End of variables declaration//GEN-END:variables
}
