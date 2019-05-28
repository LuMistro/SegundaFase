/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.AvaliacaoPOO.Dao;

import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ContatoDao extends BaseDao {

    public List<Object> pesquisarNome(String termo) throws Exception;

    public void gerarRelatorioCSV();
    public void gerarRelatorioCSVPorTipo();
}
