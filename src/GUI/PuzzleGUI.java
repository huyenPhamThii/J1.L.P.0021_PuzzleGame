/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.Manager;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HuyenPT
 */
public class PuzzleGUI extends javax.swing.JFrame {

    private Manager mana;

    public PuzzleGUI() {
        initComponents();
        mana = new Manager(this);
        cbxSize.removeAllItems();
        Dimension scrsize = Toolkit.getDefaultToolkit().getScreenSize();
        int maxsize = (int) Math.floor(scrsize.getWidth() / 100);

        for (int i = 3; i <= maxsize; i++) {
            cbxSize.addItem(i + "x" + i);
        }
    }

    public JButton getBtnNew() {
        return btnNew;
    }

    public void setBtnNew(JButton btnNew) {
        this.btnNew = btnNew;
    }

    public JComboBox<String> getCbxSize() {
        return cbxSize;
    }

    public void setCbxSize(JComboBox<String> cbxSize) {
        this.cbxSize = cbxSize;
    }

    public JLabel getLblElap() {
        return lblElap;
    }

    public void setLblElap(JLabel lblElap) {
        this.lblElap = lblElap;
    }

    public JLabel getLblMove() {
        return lblMove;
    }

    public void setLblMove(JLabel lblMove) {
        this.lblMove = lblMove;
    }

    public JPanel getPanelPuzzle() {
        return panelPuzzle;
    }

    public void setPanelPuzzle(JPanel panelPuzzle) {
        this.panelPuzzle = panelPuzzle;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPuzzle = new javax.swing.JPanel();
        lblMove = new javax.swing.JLabel();
        lblElap = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        cbxSize = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelPuzzleLayout = new javax.swing.GroupLayout(panelPuzzle);
        panelPuzzle.setLayout(panelPuzzleLayout);
        panelPuzzleLayout.setHorizontalGroup(
            panelPuzzleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );
        panelPuzzleLayout.setVerticalGroup(
            panelPuzzleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblMove.setText("Move Count:");

        lblElap.setText("Elapsed:");

        jLabel3.setText("Size:");

        btnNew.setText("New game");

        cbxSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3x3", "4x4", "5x5", "6x6", "7x7", "8x8", "9x9", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPuzzle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMove)
                    .addComponent(lblElap)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSize, 0, 96, Short.MAX_VALUE))
                    .addComponent(btnNew))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPuzzle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblMove)
                .addGap(37, 37, 37)
                .addComponent(lblElap)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnNew)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PuzzleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuzzleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuzzleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuzzleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuzzleGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox<String> cbxSize;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblElap;
    private javax.swing.JLabel lblMove;
    private javax.swing.JPanel panelPuzzle;
    // End of variables declaration//GEN-END:variables
}