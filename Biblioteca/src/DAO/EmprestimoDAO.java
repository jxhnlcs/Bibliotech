package DAO;

import MODEL.DevolucaoMODEL;
import MODEL.EmprestimoMODEL;
import MODEL.LivrosMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EmprestimoDAO {
    
    Connection conexao;
    PreparedStatement ps;
    ResultSet resultado;
    public void emprestarLivro(EmprestimoMODEL emprestimoM, LivrosMODEL livrosM){
        
        String sql = "insert into emprestimo (nome_cliente, cpf, telefone, rua, nCasa, bairro,"
                + "nome_livro, data_emprestimo, data_devolucao) values (?,?,?,?,?,?,?,?,?)";
        
        String sql02 = "update livros set status_livro = ? where nome_livro = ?";
        
        conexao = new ConexaoDAO().ConectaDB();
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, emprestimoM.getNomeCliente());
            ps.setString(2, emprestimoM.getCpf());
            ps.setString(3, emprestimoM.getTelefone());
            ps.setString(4, emprestimoM.getEndRua());
            ps.setString(5, emprestimoM.getEndNum());
            ps.setString(6, emprestimoM.getEndBairro());
            ps.setString(7, emprestimoM.getNomeLivro());
            ps.setString(8, emprestimoM.getDataAluguel());
            ps.setString(9, emprestimoM.getDataDevolucao());

            ps.execute();
            ps.close();
            
            ps = conexao.prepareStatement(sql02);
            ps.setString(1, livrosM.getStatusLivro());
            ps.setString(2, emprestimoM.getNomeLivro());
            
            ps.execute();
            ps.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar emprestar o livro" + e);
        }
    }
    
    public void PesquisarLivro(EmprestimoMODEL emprestimoM){
    
        String sql = "Select * from emprestimo where nome_livro = ?";
        
        String sql2 = "Select (cod_livro) from livros where nome_livro = ?";
        
        String sql3 = "Select (valor_livro) from livros where nome_livro = ?";
        
        conexao = new ConexaoDAO().ConectaDB();
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1,emprestimoM.getNomeLivro());
            resultado = ps.executeQuery();

            resultado.next();
            emprestimoM.setNomeLivro(resultado.getString("nome_livro"));
            emprestimoM.setNomeCliente(resultado.getString("nome_cliente"));
            
            
            ps = conexao.prepareStatement(sql2);
            ps.setString(1, emprestimoM.getNomeLivro());
            resultado = ps.executeQuery();
            
            resultado.next();
            emprestimoM.setCodLivro(resultado.getString("cod_livro"));
            
            ps.execute();
            ps.close();
            
            ps = conexao.prepareStatement(sql3);
            ps.setString(1, emprestimoM.getNomeLivro());
            resultado = ps.executeQuery();
            
            resultado.next();
            emprestimoM.setValorLivro(resultado.getString("valor_livro"));
            
            ps.execute();
            ps.close();
            
                    
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar pesquisar o livro" + e);
        }
    }
    
    public void SetarStauts(EmprestimoMODEL emprestimoM,LivrosMODEL livrosM){
        String sql = "UPDATE livros SET status_livro = ? WHERE nome_livro = ?";
        
        String sql02 = "delete from emprestimo where nome_livro = ?";
        
        conexao = new ConexaoDAO().ConectaDB();
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, livrosM.getStatusLivro());
            ps.setString(2, emprestimoM.getNomeLivro());
            
            ps.execute();
            ps.close();
            
            ps = conexao.prepareStatement(sql02);
            ps.setString(1, emprestimoM.getNomeLivro());
            
            ps.execute();
            ps.close();

            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar alterar o status" + e);
        }
    }

}
