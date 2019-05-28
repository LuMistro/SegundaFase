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
public class Turma {

    private String nome;
    private int sala;
    private List<Aluno> alunos;
    private Coordenador coordenador;

    public Turma() {
        this.alunos = new ArrayList<>();
    }

    public Turma(String nome, int sala) {
        this.nome = nome;
        this.sala = sala;
        this.alunos = new ArrayList<>();
    }

    public Turma(String nome, int sala, List<Aluno> alunos, Coordenador coordenador) {
        this.nome = nome;
        this.sala = sala;
        this.alunos = alunos;
        this.coordenador = coordenador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public void addAlunos(Aluno a) {
        this.alunos.add(a);
    }

    @Override
    public String toString() {
        String res = "Turma: " + nome + "\n";
        res += "Sala: " + sala + "\n";
        res += "Coorenador: " + coordenador + "\n";
        
        for (Aluno a : alunos) {
            res = a.toString() + "\n";
        }
        return (res);
    }

}
