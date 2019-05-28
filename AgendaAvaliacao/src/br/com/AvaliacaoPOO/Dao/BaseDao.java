package br.com.AvaliacaoPOO.Dao;

import java.util.List;

public interface BaseDao {

    public boolean inserir(Object objeto) throws Exception;

    public boolean update(Object objeto) throws Exception;

    public Object pesquisar(Integer id) throws Exception;

    public List<Object> pesquisarTodos() throws Exception;

    public boolean excluir(Integer id) throws Exception;

}
