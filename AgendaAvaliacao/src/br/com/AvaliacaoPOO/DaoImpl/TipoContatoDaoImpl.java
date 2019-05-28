/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.AvaliacaoPOO.DaoImpl;

import br.com.AvaliacaoPOO.Dao.TelefoneDao;
import br.com.AvaliacaoPOO.Dao.TipoContatoDao;
import br.com.AvaliacaoPOO.entidade.Telefone;
import br.com.AvaliacaoPOO.entidade.TipoContato;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TipoContatoDaoImpl implements TipoContatoDao {

    Connection con;
    PreparedStatement statement;
    ResultSet rs;
    
    private TelefoneDaoImpl telefoneDao = new TelefoneDaoImpl();

    private static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/agendaavaliacao", "root", "");
    }

    @Override
    public boolean inserir(Object objeto) throws Exception {
        TipoContato tp = (TipoContato) objeto;
        try {
            con = getConnection();
            statement = con.prepareStatement("Insert into tipocontato(nome) values (?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, tp.getNome());
            statement.executeUpdate();
            rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Integer idInserido = rs.getInt(1);
                tp.setId(idInserido);
                return true;
            }
        } catch (Exception e) {
            System.out.println("Erro ao inserir: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return false;

    }

    @Override
    public boolean update(Object objeto) throws Exception {
        TipoContato tp = (TipoContato) objeto;
        try {
            con = getConnection();
            statement = con.prepareStatement("Update tipocontato set nome = ? where id = ?");
            statement.setString(1, tp.getNome());
            statement.setInt(2, tp.getId());

            int executeUpdate = statement.executeUpdate();
            return executeUpdate != 0;

        } catch (Exception e) {
            System.out.println("Erro ao fazer update em tipoContato: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return false;

    }

    @Override
    public Object pesquisar(Integer id) throws Exception {
        try {
            con = getConnection();
            statement = con.prepareStatement("select * from tipoContato where id = ? ");
            statement.setInt(1, id);
            rs = statement.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                TipoContato tipoContato = new TipoContato();
                tipoContato.setNome(nome);
                tipoContato.setId(id);
                return tipoContato;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
        return null;
    }

    @Override
    public List<Object> pesquisarTodos() throws Exception {
        List<Object> tipoContatos = new ArrayList<>();
        try {
            con = getConnection();
            PreparedStatement statement = con.prepareStatement("select * from tipocontato");
            rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");

                TipoContato tp = new TipoContato();
                tp.setId(id);
                tp.setNome(nome);

                tipoContatos.add(tp);

            }
        } catch (Exception e) {
            System.out.println("Erro ao listar todos: " + e.getMessage());
            e.printStackTrace();

        } finally {
            con.close();
        }
        return tipoContatos;
    }

    @Override
    public boolean excluir(Integer id) throws Exception {
        try {
            con = getConnection();
            statement = con.prepareStatement("delete from tipocontato where id = ?");
            statement.setInt(1, id);
            int executeupdate = statement.executeUpdate();
            return executeupdate != 0;

        } catch (Exception e) {
            System.out.println("Erro ao deletar tipoContato");
            e.printStackTrace();
        } finally {
            con.close();
        }
        return false;
    }

}
