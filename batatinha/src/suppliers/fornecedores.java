/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasql;

import static aulasql.Conexao.con;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Anchieta
 */
public class fornecedores extends javax.swing.JFrame {

    /**
     * Creates new form fornecedores
     */
    public fornecedores() {
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

        jLabel8 = new javax.swing.JLabel();
        tfCodigoEmp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfNomeEmp = new javax.swing.JTextField();
        tfNumeroEmp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfEmailEmp = new javax.swing.JTextField();
        tfCepEmp = new javax.swing.JTextField();
        tfCnpj = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btIncluirEmp = new javax.swing.JButton();
        btnLimparEmp = new javax.swing.JButton();
        btnConsultarEmp = new javax.swing.JButton();
        btnSairEmp = new javax.swing.JButton();
        btnExcluirEmp = new javax.swing.JButton();
        btnAlterarEmp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("CÓDIGO DA EMPRESA:");

        tfCodigoEmp.setBackground(new java.awt.Color(255, 255, 153));

        jLabel9.setText("NOME:");

        jLabel10.setText("CEP:");

        tfCepEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCepEmpActionPerformed(evt);
            }
        });

        jLabel12.setText("EMAIL:");

        jLabel11.setText("NÚMERO:");

        jLabel13.setText("CNPJ:");

        btIncluirEmp.setText("INCLUIR");
        btIncluirEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirEmpActionPerformed(evt);
            }
        });

        btnLimparEmp.setText("LIMPAR");
        btnLimparEmp.setToolTipText("");
        btnLimparEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparEmpActionPerformed(evt);
            }
        });

        btnConsultarEmp.setText("CONSULTAR");
        btnConsultarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarEmpActionPerformed(evt);
            }
        });

        btnSairEmp.setText("SAIR");
        btnSairEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairEmpActionPerformed(evt);
            }
        });

        btnExcluirEmp.setText("EXCLUIR");
        btnExcluirEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEmpActionPerformed(evt);
            }
        });

        btnAlterarEmp.setText("ALTERAR");
        btnAlterarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfEmailEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(btnConsultarEmp))
                                    .addComponent(btIncluirEmp))
                                .addGap(65, 65, 65)
                                .addComponent(btnAlterarEmp))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnLimparEmp)
                                .addGap(94, 94, 94)
                                .addComponent(btnSairEmp)
                                .addGap(62, 62, 62)
                                .addComponent(btnExcluirEmp))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCepEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(177, 177, 177)
                                    .addComponent(jLabel9))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel11))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNomeEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(tfCodigoEmp)
                            .addComponent(tfNumeroEmp))))
                .addContainerGap(380, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tfCodigoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumeroEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCepEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfEmailEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btIncluirEmp)
                    .addComponent(btnConsultarEmp)
                    .addComponent(btnAlterarEmp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparEmp)
                    .addComponent(btnSairEmp)
                    .addComponent(btnExcluirEmp))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCepEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCepEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCepEmpActionPerformed

    private void btIncluirEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirEmpActionPerformed
        // TODO add your handling code here:
        
        
        String sql;
        String Nome, Numero, Cep, Cnpj, Email;
       
        Nome = tfNomeEmp.getText();
        Numero = tfNumeroEmp.getText();
        Cep = tfCepEmp.getText();
        Cnpj = tfCnpj.getText();
        Email = tfEmailEmp.getText();
        
        try{
            sql="insert into fornecedor (nome, numero, cep, cpf, email)"
                + " values ('" + Nome + "','" + Numero + "','" + Cep + "','" + Cnpj + "','" + Email +"')";
        
            System.out.println(sql);
           
            Statement stm = con.prepareStatement(sql);
            stm.execute(sql);
            
            JOptionPane.showMessageDialog(null, "Sucesso ao incluir os dados","Inclusão",JOptionPane.INFORMATION_MESSAGE);
            tfCodigoEmp.requestFocus();
            
        }    
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "OPAAA, houve um erro ao incluir"
                    + " os dados no banco, tente novamente" + e,"ERRO",JOptionPane.INFORMATION_MESSAGE);
            
        }  
    }//GEN-LAST:event_btIncluirEmpActionPerformed

    private void btnExcluirEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEmpActionPerformed
        // TODO add your handling code here:
    
        String sql;
        String Codigo;
        int opc; 
        Codigo = tfCodigoEmp.getText();
     
        try{
            opc = JOptionPane.showConfirmDialog(null, "Confirma exclusão", "Excluindo...", 0);
            if (opc == 0){
                sql="DELETE FROM fornecedor where idFornecedor ="+ Codigo ;

                Statement stm = con.prepareStatement(sql);
                stm.execute(sql);
                
                    tfCodigoEmp.setText("");
                    tfNomeEmp.setText("");
                    tfNumeroEmp.setText("");
                    tfCepEmp.setText("");
                    tfCnpj.setText("");
                    tfEmailEmp.setText("");
                
                JOptionPane.showMessageDialog(null, "Sucesso ao deletar os dados"
                        + ".","Inclusão",JOptionPane.INFORMATION_MESSAGE);
                
                tfCodigoEmp.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Cancelamento na operação! "
                        + "Erro ao deletar os dados.","Cancelado",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro na operação. Insira os dados"
                    + " corretos e tente novamente" + e,"ERRO",JOptionPane.INFORMATION_MESSAGE);
        }      
    }//GEN-LAST:event_btnExcluirEmpActionPerformed

    private void btnLimparEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparEmpActionPerformed
        // TODO add your handling code here:
                tfCodigoEmp.setText("");
                tfNomeEmp.setText("");
                tfNumeroEmp.setText("");
                tfCepEmp.setText("");
                tfCnpj.setText("");  
                tfEmailEmp.setText("");   
    }//GEN-LAST:event_btnLimparEmpActionPerformed

    private void btnConsultarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarEmpActionPerformed
        // TODO add your handling code here:]
        
        String sql;
        String Codigo;
        Codigo = tfCodigoEmp.getText();
        try{
        sql = "select * from fornecedor where idFuncionario = " + Codigo; 
        
        Statement stm = con.createStatement(); 

        ResultSet rs = stm.executeQuery(sql); 
        rs.first();  
        
        
        tfCodigoEmp.setText(rs.getString("idFuncionario"));
        tfNomeEmp.setText(rs.getString("nome"));
        tfNumeroEmp.setText(rs.getString("numero"));
        tfCepEmp.setText(rs.getString("cep"));
        tfCnpj.setText(rs.getString("cnpj"));
        tfEmailEmp.setText(rs.getString("email"));
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Coloque outro código do fornecedor e tente novamente","ERRO",JOptionPane.INFORMATION_MESSAGE);
          
        }    
        
        
    }//GEN-LAST:event_btnConsultarEmpActionPerformed

    private void btnAlterarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarEmpActionPerformed
        // TODO add your handling code here:
        
        String sql;
        String Codigo;
        String Nome, Numero, Cep, Cnpj, Email;
        
        Codigo = tfCodigoEmp.getText();
        Nome = tfNomeEmp.getText();
        Numero = tfNumeroEmp.getText();
        Cep = tfCepEmp.getText();
        Cnpj = tfCnpj.getText();
        Email = tfEmailEmp.getText();

        try{
            
            
            sql="update fornecedor set nome = '" + Nome + "',"
                   + "numero = '" + Numero + "',"
                   + "cep = '" + Cep + "',"
                   + "cnpj = '" + Cnpj + "',"
                   + "email = '" + Email + "' "
                   + "where idFornecedor = " + Codigo;         
            System.out.println(sql);
           
        
            Statement stm = con.prepareStatement(sql);
            stm.execute(sql);
            
                tfCodigoEmp.setText("");
                tfNomeEmp.setText("");
                tfNumeroEmp.setText("");
                tfCepEmp.setText("");
                tfCnpj.setText("");  
                tfEmailEmp.setText("");
            
            JOptionPane.showMessageDialog(null, "Houve um sucesso na alteração de seus dados","Inclusão",JOptionPane.INFORMATION_MESSAGE);
            tfCodigoEmp.requestFocus();
            
        }
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "houve um erro ao alterar seus dados, tente novamente..." + e,"ERRO",JOptionPane.INFORMATION_MESSAGE);
            
        }         
    }//GEN-LAST:event_btnAlterarEmpActionPerformed

    private void btnSairEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairEmpActionPerformed
        // TODO add your handling code here:
        
       System.exit(0);
    }//GEN-LAST:event_btnSairEmpActionPerformed

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
            java.util.logging.Logger.getLogger(fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIncluirEmp;
    private javax.swing.JButton btnAlterarEmp;
    private javax.swing.JButton btnConsultarEmp;
    private javax.swing.JButton btnExcluirEmp;
    private javax.swing.JButton btnLimparEmp;
    private javax.swing.JButton btnSairEmp;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfCepEmp;
    private javax.swing.JTextField tfCnpj;
    private javax.swing.JTextField tfCodigoEmp;
    private javax.swing.JTextField tfEmailEmp;
    private javax.swing.JTextField tfNomeEmp;
    private javax.swing.JTextField tfNumeroEmp;
    // End of variables declaration//GEN-END:variables
}
