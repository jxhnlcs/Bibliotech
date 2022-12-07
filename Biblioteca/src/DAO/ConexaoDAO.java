package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
 
    public Connection ConectaDB(){
        Connection conexao = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/banco_biblioteca?user=root&password=";
            conexao = DriverManager.getConnection(url);
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar conectar com o banco" 
            + erro.getMessage());
        }
        
        return conexao;
    }
    
}
