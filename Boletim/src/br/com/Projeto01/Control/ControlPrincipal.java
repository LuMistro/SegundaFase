/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Projeto01.Control;

import br.com.Projeto01.Model.Aluno;
import br.com.Projeto01.Model.Coordenador;
import br.com.Projeto01.Model.Disciplina;
import br.com.Projeto01.Model.Turma;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Luiza Mistro
 */
public class ControlPrincipal {

    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;

    List<Disciplina> disc = new ArrayList<>();
    List<Aluno> alunos = new ArrayList<>();
    Turma t = new Turma();
    Coordenador c = new Coordenador();
    Aluno a = new Aluno();

    public ControlPrincipal() {
    }

    public ControlPrincipal(JTextField jTextField1, JTextField jTextField3, JTextField jTextField4, JTextField jTextField5, JTextField jTextField6, JTextField jTextField7, JTextField jTextField8, JTextField jTextField9) {
        this.jTextField1 = jTextField1;
        this.jTextField3 = jTextField3;
        this.jTextField4 = jTextField4;
        this.jTextField5 = jTextField5;
        this.jTextField6 = jTextField6;
        this.jTextField7 = jTextField7;
        this.jTextField8 = jTextField8;
        this.jTextField9 = jTextField9;
    }

    public void addAluno() {
        if (!jTextField6.getText().equals("") || !jTextField7.getText().equals("") || !jTextField3.getText().equals("")
                || !jTextField4.getText().equals("") || !jTextField1.getText().equals("") || !jTextField5.getText().equals("")) {

            a.setNome(jTextField6.getText());

            if (new Integer(jTextField7.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Matrícula não adimite numero negativo");
            } else {
                a.setMatricula(new Integer(jTextField7.getText()));
            }
            a.setDisciplinas(disc);
            disc = new ArrayList<>();
            alunos.add(a);
            a = new Aluno();

            c.setNome(jTextField3.getText());

            if (new Integer(jTextField4.getText()) < 0 || jTextField4.getText().length() > 9) {
                JOptionPane.showMessageDialog(null, "Número de telefone incorreto");
            } else {
                c.setTelefone(jTextField4.getText());
            }

            t.setNome(jTextField1.getText());
            t.setSala(new Integer(jTextField5.getText()));
            t.setAlunos(alunos);
            t.setCoordenador(c);

            jTextField6.setText("");
            jTextField7.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente");
        }

    }

    public void addDisciplina() {

        if (!jTextField8.getText().equals("") || !jTextField9.getText().equals("")) {
            Disciplina d = new Disciplina();
            d.setNome(jTextField8.getText());
            d.setMedia(new Double(jTextField9.getText()));

            disc.add(d);

            jTextField8.setText("");
            jTextField9.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Lista de disciplinas e médias vazia");
        }

    }

    public void mostrarResultados() {
        String m = "RESULTADOS FINAIS\r\n";
        m += alunos.toString() + "\n";
        System.out.println(m);

    }

}
