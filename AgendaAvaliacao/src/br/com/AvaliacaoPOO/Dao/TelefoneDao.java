/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.AvaliacaoPOO.Dao;

import br.com.AvaliacaoPOO.entidade.Telefone;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface TelefoneDao extends BaseDao {

    public List<Object> pesquisarTelefoneContatos(Integer idContato) throws Exception;

}
