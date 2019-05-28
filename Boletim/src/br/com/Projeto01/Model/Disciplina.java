/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Projeto01.Model;

/**
 *
 * @author Luiza Mistro
 */
public class Disciplina {
    
    private String nome;
    private Double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

   public boolean getSituacao(){
        return this.media>=7;
    }

    public Disciplina() {
    }

    public Disciplina(String nome, Double media) {
        this.nome = nome;
        this.media = media;
    }
    
    public String getSituacaoString(){
        if (getSituacao()) 
            return "Aprovado";
    return "Reprovado";
    }

    @Override
    public String toString() {
        String res = "Disciplina: " + nome + "\n";
        res += "Média: " + media + "\n";
        res += "Situação: " + getSituacaoString();
        return (res);
    }
    
    
    
}
