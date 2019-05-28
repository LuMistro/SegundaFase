package br.com.AvaliacaoPOO.DaoImpl;

import br.com.AvaliacaoPOO.Dao.TelefoneDao;
import br.com.AvaliacaoPOO.entidade.Contato;
import br.com.AvaliacaoPOO.entidade.Telefone;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TelefoneDaoImpl implements TelefoneDao {

    Connection con;
    PreparedStatement statement;
    ResultSet rs;
    private ContatoDaoImpl ContatoDao;

    private static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/agendaavaliacao", "root", "");
    }

    @Override
    public boolean inserir(Object objeto) throws Exception {
        Telefone t = (Telefone) objeto;
        try {
            con = getConnection();
            statement = con.prepareStatement("Insert into telefone(ddd, numero, contatoid) values (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, t.getDdd());
            statement.setString(2, t.getNumero());
            statement.setObject(3, t.getContato().getId());
            statement.executeUpdate();

            rs = statement.getGeneratedKeys();
            while (rs.next()) {
                Integer idInserido = rs.getInt(1);
                t.setId(idInserido);
                return true;
            }

        } catch (Exception e) {
            System.out.println("Erro ao inserir: " + e.getMessage());
            e.printStackTrace();
        } finally {
            con.close();
        }

        return false;

    }

    @Override
    public boolean update(Object objeto) throws Exception {
        Telefone t = (Telefone) objeto;
        try {
            con = getConnection();
            statement = con.prepareStatement("update telefone set ddd = ?, numero = ?, contatoid = ? where id = ?");
            statement.setString(1, t.getDdd());
            statement.setString(2, t.getNumero());
            statement.setObject(3, t.getContato());
            int executeUpdate = statement.executeUpdate();
            return executeUpdate != 0;

        } catch (Exception e) {
            System.out.println("Erro ao executar update em Telefone: " + e.getMessage());
            e.printStackTrace();
        } finally {
            con.close();
        }
        return false;
    }

    @Override
    public Object pesquisar(Integer id) throws Exception {
        try {
            ContatoDao = new ContatoDaoImpl();
            con = getConnection();
            statement = con.prepareStatement("select * from telefone where contatoid = ?");
            statement.setInt(1, id);
            rs = statement.executeQuery();

            while (rs.next()) {
                String ddd = rs.getString("ddd");
                String numero = rs.getString("numero");
                int contatoid = rs.getInt("contatoid");

                Telefone t = new Telefone();
                t.setId(id);
                t.setDdd(ddd);
                t.setNumero(numero);
                Contato c = (Contato) ContatoDao.pesquisar(contatoid);
                t.setContato(c);

                return c;
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar" + e.getMessage());
            e.printStackTrace();
        } finally {
            con.close();
        }
        return null;
    }

    @Override
    public List<Object> pesquisarTodos() throws Exception {
        List<Object> telefones = new ArrayList<>();
        try {
            ContatoDao = new ContatoDaoImpl();
            con = getConnection();
            statement = con.prepareStatement("select * from telefone");
            rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ddd = rs.getString("ddd");
                String numero = rs.getString("numero");
                int idContato = rs.getInt("idcontato");

                Telefone t = new Telefone();
                t.setId(id);
                t.setDdd(ddd);
                t.setNumero(numero);

                Contato c = (Contato) ContatoDao.pesquisar(idContato);
                t.setContato(c);

                telefones.add(t);

                return telefones;

            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar todos os telefones: " + e.getMessage());
            e.printStackTrace();
        } finally {
            con.close();
        }
        return null;
    }

    @Override
    public boolean excluir(Integer id) throws Exception {
        try {
            con = getConnection();
            statement = con.prepareStatement("delete from telefone where contatoid = ?");
            statement.setInt(1, id);
            int executeUpdate = statement.executeUpdate();
            return executeUpdate != 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
        return false;
    }

    @Override
    public List<Object> pesquisarTelefoneContatos(Integer idContato) throws Exception {
        List<Object> telefones = new ArrayList<>();
        try {
            ContatoDao = new ContatoDaoImpl();
            con = getConnection();
            statement = con.prepareStatement("select * from telefone where contatoid = ?");
            statement.setInt(1, idContato);
            rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ddd = rs.getString("ddd");
                String numero = rs.getString("numero");
//                int ContatoId = rs.getInt("contatoid");

                Telefone t = new Telefone();
                t.setId(id);
                t.setDdd(ddd);
                t.setNumero(numero);

                Contato c = (Contato) ContatoDao.pesquisar(idContato);
                t.setContato(c);

                telefones.add(t);

                return telefones;

            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar todos os telefones: " + e.getMessage());
            e.printStackTrace();
        } finally {
            con.close();
        }
        return telefones;
    }

}
