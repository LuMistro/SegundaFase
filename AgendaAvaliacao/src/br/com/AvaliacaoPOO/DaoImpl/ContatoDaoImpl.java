package br.com.AvaliacaoPOO.DaoImpl;

import br.com.AvaliacaoPOO.Dao.ContatoDao;
import br.com.AvaliacaoPOO.Dao.TelefoneDao;
import br.com.AvaliacaoPOO.Dao.TipoContatoDao;
import br.com.AvaliacaoPOO.entidade.Contato;
import br.com.AvaliacaoPOO.entidade.TipoContato;
import java.sql.Connection;
//import java.sql.Date;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ContatoDaoImpl implements ContatoDao {

    Connection con;
    PreparedStatement statement;
    ResultSet rs;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private TipoContatoDaoImpl tipoContatoDao = new TipoContatoDaoImpl();
//    private TelefoneDaoImpl telefoneDao;

    private static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/agendaavaliacao?zeroDateTimeBehavior=round", "root", "");
    }

    @Override
    //inserir telefones

    public boolean inserir(Object objeto) throws Exception {
        Contato c = (Contato) objeto;
        try {
            con = getConnection();
            statement = con.prepareStatement("insert into contato(nome,nascimento,email, tipoContatoid) values(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, c.getNome());
            statement.setDate(2,new java.sql.Date(c.getDataNascimmento().getTime()));
            statement.setString(3, c.getEmail());
            statement.setObject(4, c.getTipoContato().getId());
            statement.executeUpdate();

            rs = statement.getGeneratedKeys();

            if (rs.next()) {
                Integer idInserido = rs.getInt(1);
                c.setId(idInserido);
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
    // update em telefone
    public boolean update(Object objeto) throws Exception {
        Contato c = (Contato) objeto;
        try {
            con = getConnection();
            statement = con.prepareStatement("update contato set nome = ?, nascimento = ?, email  = ?, tipoContatoid = ? where id = ?");
            statement.setString(1, c.getNome());
            statement.setDate(2, (java.sql.Date) c.getDataNascimmento());
            statement.setString(3, c.getEmail());
            statement.setObject(4, c.getTipoContato().getId());
            statement.setInt(5, c.getId());
            int executeUpdate = statement.executeUpdate();
            return executeUpdate != 0;

        } catch (Exception e) {
            System.out.println("Erro ao fazer update: " + e.getMessage());
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
            statement = con.prepareStatement("Select * from contato where id = ?");
            statement.setInt(1, id);
            rs = statement.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                Date nascimento = rs.getDate("nascimento");
                String email = rs.getString("email");
                Integer tipoContatoId = rs.getInt("tipocontatoid");

                Contato c = new Contato();
                c.setId(id);
                c.setNome(nome);
                c.setDataNascimmento(nascimento);
                c.setEmail(email);

                TipoContato tp = (TipoContato) tipoContatoDao.pesquisar(tipoContatoId);
                c.setTipoContato(tp);
                c.setId(id);

                return c;

            }
            return null;
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar por contato " + e.getMessage());
            e.printStackTrace();
        } finally {
            con.close();
        }
        return null;
    }

    @Override
    public List<Object> pesquisarTodos() throws Exception {
        List<Object> contatos = new ArrayList<>();
        try {
            con = getConnection();
            statement = con.prepareStatement("select * from contato");
            rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                Date nascimento = rs.getDate("nascimento");
                String email = rs.getString("email");
                Integer tipoContatoId = rs.getInt("tipocontatoid");

                Contato c = new Contato();
                c.setId(id);
                c.setNome(nome);
                c.setDataNascimmento(nascimento);
                c.setEmail(email);

                TipoContato tp = (TipoContato) tipoContatoDao.pesquisar(tipoContatoId);
                c.setTipoContato(tp);

                contatos.add(c);

            }

        } catch (Exception e) {
            System.out.println("Erro ao listar todos:  " + e.getMessage());
            e.printStackTrace();

        } finally {
            con.close();
        }
        return contatos;
    }

    @Override
    public boolean excluir(Integer id) throws Exception {
        try {
            con = getConnection();
            statement = con.prepareStatement("delete from contato where id = ? ");
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
    public List<Object> pesquisarNome(String termo) throws Exception {
        List<Object> contatos = new ArrayList<>();

        try {
            con = getConnection();
            statement = con.prepareStatement("select * from contato where nome like ?");
            statement.setString(1, "%" + termo + "%");
            rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                Date nascimento = rs.getDate("nascimento");
                String email = rs.getString("email");
                Integer tipoContatoId = rs.getInt("tipocontatoid");

                Contato c = new Contato();
                c.setId(id);
                c.setNome(nome);
                c.setDataNascimmento(nascimento);
                c.setEmail(email);

                TipoContato tp = (TipoContato) tipoContatoDao.pesquisar(tipoContatoId);
                c.setTipoContato(tp);

                contatos.add(c);

            }
            return contatos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contatos;
    }

    @Override
    public void gerarRelatorioCSV() {
        try {

            String aspas = "";
            String sql = ("SELECT * FROM contato order by nome INTO OUTFILE '/temp/contatos.csv' FIELDS TERMINATED BY ';' ENCLOSED BY '" + aspas + "' LINES TERMINATED BY '\n' ");

            con = getConnection();
            statement = con.prepareStatement(sql);
            statement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void gerarRelatorioCSVPorTipo() {
        try {

            String aspas = "";
            String sql = ("SELECT * FROM contato order by tipocontatoid INTO OUTFILE '/temp/contatosPorTipo.csv' FIELDS TERMINATED BY ';' ENCLOSED BY '" + aspas + "' LINES TERMINATED BY '\n' ");

            con = getConnection();
            statement = con.prepareStatement(sql);
            statement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
