package DAO;

import MODEL.LivrosMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class LivrosDAO {
    Connection  conexao;
    PreparedStatement ps;
    ResultSet  resultado;
    ArrayList<LivrosMODEL> lista = new ArrayList<>();
    public void cadastrarLivro(LivrosMODEL livrosM){
        String sql = "Insert into livros (nome_livro, editora, autor, categoria, valor_livro"
                + ", ano_lancamento, cod_livro) values (?,?,?,?,?,?,?)";
        
        conexao = new ConexaoDAO().ConectaDB();
        
        try {
            ps = conexao.prepareStatement(sql);
            
            ps.setString(1, livrosM.getNomeLivro());
            ps.setString(2, livrosM.getEditora());
            ps.setString(3, livrosM.getAutor());
            ps.setString(4, livrosM.getCategoria());
            ps.setString(5, livrosM.getValorLivro());
            ps.setString(6, livrosM.getAnoLancamento());
            ps.setString(7, livrosM.getCodLivro());
            
            ps.execute();
            ps.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro cadastrar o livro"  + e.getMessage());
        }
    }
    
    public ArrayList<LivrosMODEL> listarLivros(){
        
        String sql = "Select * from livros";
        
        conexao = new ConexaoDAO().ConectaDB();
        
        try {
            ps = conexao.prepareStatement(sql);
            resultado = ps.executeQuery();
            
            while(resultado.next()){
                LivrosMODEL livrosM = new LivrosMODEL();
                livrosM.setId(resultado.getInt("id"));
                livrosM.setNomeLivro(resultado.getString("nome_livro"));
                livrosM.setEditora(resultado.getString("editora"));
                livrosM.setAutor(resultado.getString("autor"));
                livrosM.setCategoria(resultado.getString("categoria"));
                livrosM.setStatusLivro(resultado.getString("status_livro"));
                livrosM.setValorLivro(resultado.getString("valor_livro"));
                livrosM.setAnoLancamento(resultado.getString("ano_lancamento"));
                livrosM.setCodLivro(resultado.getString("cod_livro"));
                
                lista.add(livrosM);
            }
                    
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro ao tentar listar os livros" + e);
        }
        return lista;
    }

    public void editarLivro(LivrosMODEL livrosM){
        String sql = "update livros set nome_livro = ?, editora = ?, autor = ?, categoria = ?"
                + ", valor_livro = ?, ano_lancamento = ?, cod_livro = ? where id = ?";
        
        conexao =  new ConexaoDAO().ConectaDB();
        
        try {
           ps = conexao.prepareStatement(sql);
           
           ps.setString(1, livrosM.getNomeLivro());
           ps.setString(2, livrosM.getEditora());
           ps.setString(3, livrosM.getAutor());
           ps.setString(4, livrosM.getCategoria());
           ps.setString(5, livrosM.getValorLivro());
           ps.setString(6, livrosM.getAnoLancamento());
           ps.setString(7, livrosM.getCodLivro());
           ps.setInt(8, livrosM.getId());
           
           ps.execute();
           ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar editar o livro" + e);
        }
    }
    
    public void ExcluirLivro(LivrosMODEL livrosM){
        String sql = "delete from livros where id = ?";
        
        conexao =  new ConexaoDAO().ConectaDB();
       
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, livrosM.getId());
            
            ps.execute();
            ps.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o livro" + erro);
        }
    }
    
    
    
}
