package DAO;

import DTO.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
    Connection conexao;
    PreparedStatement pstm;
    
    public void cadastrarProduto(ProdutoDTO objProdutoDTO) throws SQLException {
        String sql = "insert into produto (modelo, quantidade, valor_unitario) values (?,?,?)";
        
        conexao = new ConexaoBD().conectaBD();
        
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objProdutoDTO.getNome_produto());
            pstm.setString(2, objProdutoDTO.getQuantidade_produto());
            pstm.setString(3, objProdutoDTO.getValor_produto());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        }
    }
    
}
