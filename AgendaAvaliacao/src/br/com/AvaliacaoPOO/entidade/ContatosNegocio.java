/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.AvaliacaoPOO.entidade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class ContatosNegocio {

    private static List<Contato> CONTATOS = new ArrayList<>();
    private static Integer proximo_id = 1;

    public static List<Object> pesquisar(String termo) {
        List<Object> retorno = new ArrayList<>();
        for (Contato contato : CONTATOS) {
            if (contato.getNome().toLowerCase().contains(termo.toLowerCase()) || contato.getEmail().toLowerCase().contains(termo.toLowerCase())) {
                retorno.add(contato);
            }
        }
        return retorno;
    }

    public static void adicionar(Contato contato) {
        contato.setId(proximo_id);
        CONTATOS.add(contato);
        proximo_id++;

    }

    public static boolean excluir(Integer id) {

        for (int i = 0; i < CONTATOS.size(); i++) {
            Contato c = CONTATOS.get(i);
            if (c.getId().equals(id)) {
                CONTATOS.remove(c);
                return true;
            }
        }
        return false;
    }

}
