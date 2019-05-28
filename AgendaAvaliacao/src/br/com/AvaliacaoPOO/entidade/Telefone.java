package br.com.AvaliacaoPOO.entidade;

public class Telefone {

    private int id;
    private String ddd;
    private String numero;
    private Contato contato;

    public Telefone() {
    }

    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return ("IdTelefone:" + this.id + " DDD: " + this.ddd + " Número: " + this.numero + "\r\n");
    }
    
    

}
