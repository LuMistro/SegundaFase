/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Projeto01.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luiza Mistro
 */
public class Aluno {

    private int matricula;
    private String nome;
    private List<Disciplina> disciplinas;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    

    public Aluno() {
        this.disciplinas = new ArrayList<>();
    }

    public Aluno(int matricula, String nome, List<Disciplina> disciplinas) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplinas = disciplinas;
    }
    
    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void addDisciplina(Disciplina d) {
        this.disciplinas.add(d);
        
    }

    @Override
    public String toString() {
        String resultado = "Aluno: " + this.nome + "\n" + " Matrícula: " + this.matricula + "\n";
       
        for (Disciplina d : disciplinas) {
            resultado += d.toString() + "\n";
        }
        
        return (resultado);
    }
    
    
}
