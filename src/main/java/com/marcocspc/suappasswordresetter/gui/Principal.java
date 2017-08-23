/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcocspc.suappasswordresetter.gui;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import com.marcocspc.suappasswordresetter.suap.Servidor;
import com.marcocspc.suappasswordresetter.suap.Suap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author marcocspc
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jLabel1 = new javax.swing.JLabel();
        campoArquivo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMatriculas = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        campoMatriculas = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        campoSenhaPadrao = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Arquivo:");

        campoArquivo.setText("Arquivo com matrículas separadas linha a linha");
        campoArquivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoArquivoFocusGained(evt);
            }
        });

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        listaMatriculas.setModel(new DefaultListModel()
        );
        jScrollPane1.setViewportView(listaMatriculas);

        jLabel2.setText("Matrículas");

        campoMatriculas.setText("Insira uma matrícula");
        campoMatriculas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoMatriculasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoMatriculasFocusLost(evt);
            }
        });
        campoMatriculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMatriculasActionPerformed(evt);
            }
        });

        jButton2.setText("Adicionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Remover");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        campoSenhaPadrao.setText("Insira uma senha padrão");
        campoSenhaPadrao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoSenhaPadraoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoSenhaPadraoFocusLost(evt);
            }
        });

        jButton4.setText("Gerar senha padrão");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Redefinir Senhas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoMatriculas)
                            .addComponent(campoSenhaPadrao)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4)
                            .addComponent(jButton6))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoMatriculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSenhaPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoArquivoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoArquivoFocusGained
        campoArquivo.selectAll();
    }//GEN-LAST:event_campoArquivoFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.adicionarMatriculaNaLista();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!listaMatriculas.isSelectionEmpty()) {
            DefaultListModel dfl = (DefaultListModel) listaMatriculas.getModel();

            dfl.removeRange(listaMatriculas.getSelectedIndex(), listaMatriculas.getSelectedIndex() + listaMatriculas.getSelectedIndices().length - 1);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void campoMatriculasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoMatriculasFocusGained
        if (campoMatriculas.getText().equals("Insira uma matrícula")) {
            campoMatriculas.setText("");
        }
    }//GEN-LAST:event_campoMatriculasFocusGained

    private void campoMatriculasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoMatriculasFocusLost
        if (campoMatriculas.getText().equals("Insira uma matrícula")) {
            campoMatriculas.setText("");
        }
    }//GEN-LAST:event_campoMatriculasFocusLost

    private void campoSenhaPadraoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaPadraoFocusGained
        if (campoSenhaPadrao.getText().equals("Insira uma senha padrão")) {
            campoSenhaPadrao.setText("");
        }
    }//GEN-LAST:event_campoSenhaPadraoFocusGained

    private void campoSenhaPadraoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaPadraoFocusLost
        if (campoSenhaPadrao.getText().equals("")) {
            campoSenhaPadrao.setText("Insira uma senha padrão");
        }
    }//GEN-LAST:event_campoSenhaPadraoFocusLost

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("YYYY");
        String senha = "Ifrn." + s.format(d);

        campoSenhaPadrao.setText(senha);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(this, "Atenção! As senhas começarão a ser redefinidas.\n"
                + "A aplicação poderá congelar durante o processo devido a uma limitação da biblioteca HTMLUnit.\n"
                + "Porém este é um comportamento normal e é muito importante que não encerre a aplicação durante o processo.\n"
                + "Aperte em OK para continuar.");

        Suap s = new Suap(servidor);

        if (!campoSenhaPadrao.getText().equals("")) {
            DefaultListModel<String> dlm = (DefaultListModel<String>) listaMatriculas.getModel();
            try {
                String matr;
                for (int x = 0; x < dlm.size(); x++) {
                    matr = dlm.get(x);
                    s.redefinirSenha(matr, campoSenhaPadrao.getText());
                }
                
                JOptionPane.showMessageDialog(this, "Senhas redefinidas!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "A senha padrão não pode estar vazia!");
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setAcceptAllFileFilterUsed(true);
        jfc.setMultiSelectionEnabled(false);
        jfc.showOpenDialog(this);

        File f = jfc.getSelectedFile();

        FileReader fr;
        try {
            fr = new FileReader(f);
            BufferedReader reader = new BufferedReader(fr);

            LinkedList<String> lista = new LinkedList<String>();
            String line = "";
            
            while ((line = reader.readLine()) != null) {
                lista.add(line);
            }
            
            reader.close();
            
            DefaultListModel dlm = (DefaultListModel) listaMatriculas.getModel();
            
            for (String linha : lista) {
                dlm.addElement(line);
            }
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (IOException ex2) {
            JOptionPane.showMessageDialog(this, ex2.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void campoMatriculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMatriculasActionPerformed
        this.adicionarMatriculaNaLista();
    }//GEN-LAST:event_campoMatriculasActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoArquivo;
    private javax.swing.JTextField campoMatriculas;
    private javax.swing.JTextField campoSenhaPadrao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaMatriculas;
    // End of variables declaration//GEN-END:variables
    private Servidor servidor;

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    private void adicionarMatriculaNaLista () {
        DefaultListModel dlm = (DefaultListModel) listaMatriculas.getModel();

        if (!campoMatriculas.getText().equals("") && campoMatriculas.getText().matches("[0-9]+")) {
            dlm.addElement(campoMatriculas.getText());
            campoMatriculas.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Somente números.");
        }
    }
}
