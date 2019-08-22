/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmwfr.jpaint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author JMA
 */
public class MainFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shapeButtonGroup = new javax.swing.ButtonGroup();
        panelTop = new javax.swing.JPanel();
        rbLine = new javax.swing.JRadioButton();
        rbRectangle = new javax.swing.JRadioButton();
        rbCircle = new javax.swing.JRadioButton();
        btnClear = new javax.swing.JButton();
        cbColor = new javax.swing.JComboBox<>();
        drawPanel = new com.jmwfr.jpaint.MyCanvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jPaint");
        setExtendedState(6);
        setName("mainFrame"); // NOI18N

        panelTop.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        panelTop.setName("panelTop"); // NOI18N

        shapeButtonGroup.add(rbLine);
        rbLine.setSelected(true);
        rbLine.setText("Line");
        rbLine.setName("rbLine"); // NOI18N

        shapeButtonGroup.add(rbRectangle);
        rbRectangle.setText("Rectangle");
        rbRectangle.setName("rbRectangle"); // NOI18N

        shapeButtonGroup.add(rbCircle);
        rbCircle.setText("Circle");
        rbCircle.setName("rbCircle"); // NOI18N

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        cbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BLACK", "BLUE", "GREEN", "RED", "YELLOW" }));
        cbColor.setName("cbColor"); // NOI18N
        cbColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbColorItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelTopLayout = new javax.swing.GroupLayout(panelTop);
        panelTop.setLayout(panelTopLayout);
        panelTopLayout.setHorizontalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbRectangle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbCircle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear)
                .addContainerGap(300, Short.MAX_VALUE))
        );
        panelTopLayout.setVerticalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rbLine)
                    .addComponent(rbRectangle)
                    .addComponent(rbCircle)
                    .addComponent(cbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        drawPanel.setBackground(new java.awt.Color(255, 255, 255));
        drawPanel.setAlignmentY(0.0F);
        drawPanel.setName("drawPanel"); // NOI18N
        drawPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drawPanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout drawPanelLayout = new javax.swing.GroupLayout(drawPanel);
        drawPanel.setLayout(drawPanelLayout);
        drawPanelLayout.setHorizontalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        drawPanelLayout.setVerticalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTop.getAccessibleContext().setAccessibleName("panelTop");
        drawPanel.getAccessibleContext().setAccessibleName("drawPanel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbColorItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbColorItemStateChanged

    private void drawPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_drawPanelMousePressed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        Graphics g = drawPanel.getGraphics();
        drawPanel.repaint();
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox<String> cbColor;
    private com.jmwfr.jpaint.MyCanvas drawPanel;
    private javax.swing.JPanel panelTop;
    private javax.swing.JRadioButton rbCircle;
    private javax.swing.JRadioButton rbLine;
    private javax.swing.JRadioButton rbRectangle;
    private javax.swing.ButtonGroup shapeButtonGroup;
    // End of variables declaration//GEN-END:variables
}
