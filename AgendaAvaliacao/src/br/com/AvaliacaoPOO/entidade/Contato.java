package br.com.AvaliacaoPOO.entidade;

import java.util.Date;
import java.util.List;

public class Contato implements Comparable<Contato> {

    private Integer id;
    private String nome;
    private Date dataNascimmento;
    private String email;
    private TipoContato tipoContato;
    private List<Telefone> telefones;

    public Contato() {
    }

    public Contato(String nome, Date dataNascimmento, String email) {
        this.nome = nome;
        this.dataNascimmento = dataNascimmento;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimmento() {
        return dataNascimmento;
    }

    public void setDataNascimmento(Date dataNascimmento) {
        this.dataNascimmento = dataNascimmento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return (this.id + "");
    }

    @Override
    public int compareTo(Contato o) {
       return this.id.compareTo(o.getId());

    }

}
