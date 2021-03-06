/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaavaliacaoSwing;

import br.com.AvaliacaoPOO.Dao.TelefoneDao;
import br.com.AvaliacaoPOO.DaoImpl.ContatoDaoImpl;
import br.com.AvaliacaoPOO.DaoImpl.TelefoneDaoImpl;
import br.com.AvaliacaoPOO.Principal.Principal;
import br.com.AvaliacaoPOO.entidade.Contato;
import br.com.AvaliacaoPOO.entidade.ContatosNegocio;
import br.com.AvaliacaoPOO.entidade.Telefone;
import br.com.AvaliacaoPOO.entidade.TipoContato;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alunos
 */
public class JPanelPesquisar extends javax.swing.JPanel {

    ContatoDaoImpl contatodao = new ContatoDaoImpl();
    TelefoneDaoImpl telefoneDao;

    /**
     * Creates new form JPanelPesquisar
     */
    public JPanelPesquisar() throws Exception {
        initComponents();
        telefoneDao = new TelefoneDaoImpl();
        List<Object> contatos = new ArrayList<>();
        contatos.addAll(contatodao.pesquisarTodos());
        adicionarContatoTabela(contatos);

//        List<Object> Telefones = new ArrayList<>();
//        try {
//            Telefones.addAll(telefoneDao.pesquisarTodos());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        adicionarTelefoneTabela(Telefones);
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Pesquisa Contato");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Busca:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gerar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Gerar relatório CSV de contatos:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Gerar relatório CSV de contatos organizados por tipo:");

        jButton3.setText("Gerar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton5.setText("Buscar telefone");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setText("Excluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Editar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton3))
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<Object> contatos = new ArrayList<>();
        try {
            contatos.addAll(contatodao.pesquisarNome(jTextField1.getText()));
            adicionarContatoTabela(contatos);

        } catch (Exception ex) {
            System.out.println("Erro ao mostrar pesquisa: " + ex.getMessage());
            ex.printStackTrace();
        }
//        try {
//            List<Object> Telefones = new ArrayList<>();
//            Telefones.addAll(telefoneDao.pesquisarTodos());
//            adicionarTelefoneTabela(Telefones);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        contatodao.gerarRelatorioCSV();
        JOptionPane.showMessageDialog(this, "Relatório gerado com sucesso! Favor, checar pasta tmp do seu computador.");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        contatodao.gerarRelatorioCSVPorTipo();
        JOptionPane.showMessageDialog(this, "Relatório gerado com sucesso! Favor, checar pasta tmp do seu computador.");


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1FocusGained

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        List<Object> telefones = new ArrayList<>();
        try {
            int linha = jTable1.getSelectedRow();
            if (linha >= 0) {
//                List<Object> telefoneObj = new ArrayList<>();
                String idString = jTable1.getValueAt(linha, 0).toString();
                Integer idContato = Integer.valueOf(idString);
                List<Object> telefonespesquisa = telefoneDao.pesquisarTelefoneContatos(idContato);
                boolean addAll = telefones.addAll(telefonespesquisa);

//                Contato aux = (Contato) contatodao.pesquisar(idContato);
                for (int i = 0; i < telefones.size(); i++) {
                    Telefone telefone = (Telefone) telefones.get(i);
                    System.out.println("DDD: " + telefone.getDdd());
                    System.out.println("Tel: " + telefone.getNumero());
                }

                Object[] colunas = {"DDD", "Numero"};
                Object[][] dados = new String[telefones.size()][colunas.length];

                for (int i = 0; i < telefones.size(); i++) {

                    Telefone t = (Telefone) telefones.get(i);
                    dados[i][0] = t.getDdd();
                    dados[i][1] = t.getNumero();
                }
                DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
                jTable2.setModel(modelo);

//                }
            }
//            List<Object> Telefones = new ArrayList<>();
//            Telefones.addAll(telefoneDao.pesquisarTodos());
//            adicionarTelefoneTabela(Telefones);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        try {
//
//            List<Object> telefones = new ArrayList<>();
//            telefones.addAll((Collection<? extends Object>) telefoneDao.pesquisar(Integer.valueOf(jTextField2.getText())));
//
//            adicionarTelefoneTabela(telefones);
//
//        } catch (Exception e) {
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            int linha = jTable1.getSelectedRow();
            if (linha >= 0) {
                String idString = jTable1.getValueAt(linha, 0).toString();
                Integer idContato = Integer.valueOf(idString);

                contatodao.excluir(idContato);
                telefoneDao.excluir(idContato);
                JOptionPane.showMessageDialog(this, "Contato excluído com sucesso!");
                List<Object> contatos = new ArrayList<>();
                contatos.addAll(contatodao.pesquisarTodos());
                adicionarContatoTabela(contatos);

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Integer linha = jTable1.getSelectedRow();
        if (linha >= 0) {
            String stringId = (String) jTable1.getValueAt(linha, 0);
            Integer id = Integer.parseInt(stringId);
            try {
                Contato contato = (Contato) contatodao.pesquisar(id);
                Principal.adicionarPainelEditarContato();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Contato editado com sucesso");
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void adicionarContatoTabela(List<Object> contatos) {
        String[] colunas = {"id", "Nome", "nascimento", "email", "tipoContato"};
        String[][] dados = new String[contatos.size()][colunas.length];
        for (int i = 0; i < contatos.size(); i++) {

            Contato c = (Contato) contatos.get(i);
            dados[i][0] = c.getId().toString();
            dados[i][1] = c.getNome();
            dados[i][2] = c.getDataNascimmento().toString();
            dados[i][3] = c.getEmail();
            dados[i][4] = c.getTipoContato().getNome();

        }
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
        jTable1.setModel(modelo);

    }

    private void adicionarTelefoneTabela(List<Object> telefones) {
        Object[] colunas = {"DDD", "Numero"};
        Object[][] dados = new String[telefones.size()][colunas.length];

        for (int i = 0; i < telefones.size(); i++) {

            Telefone t = (Telefone) telefones.get(i);
            dados[i][0] = t.getDdd();
            dados[i][1] = t.getNumero();
        }
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
        jTable2.setModel(modelo);

    }

    private void adicionarTelefoneTabelaPesquisa(List<Object> telefones) {

//         Object[] novoTelefone = null; 
//         Telefone tele 
//        for (int i = 0; i < telefones.size(); i++) {
//             Object t  = telefones.get(i);
//             
//             
////            dados[i][0] = t.getDdd();
////            dados[i][1] = t.getNumero();
//        String ddd = t.getDdd();
//        String numero = t.getNumero();
//
//       novoTelefone = new Object[2];
//        novoTelefone[0] = ddd;
//        novoTelefone[1] = numero;
//            
//        }
//
//        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
//        model.addRow(novoTelefone);
//        model.fireTableDataChanged();
//
////        String[] colunas = {"DDD", "Numero"};
////        String[][] dados = new String[telefones.size()][colunas.length];
////        for (int i = 0; i < telefones.size(); i++) {
////
////        
////           
////        }
////        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
////        jTable2.setModel(modelo);
////        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
////        model.addRow(t);
////        model.fireTableDataChanged();
////        String ddd = jTextField4.getText();
////            String numero = jTextField5.getText();
////
////            Object[] novoTelefone = new Object[2];
////            novoTelefone[0] = ddd;
////            novoTelefone[1] = numero;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
