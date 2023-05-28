package DAO;

import DTO.NotaFiscalDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class NotaFiscalDAO {
    
    Connection conexao;
    PreparedStatement pstm;

    public void geraNota(NotaFiscalDTO objNotaFiscalDTO) throws SQLException {
        String sql = "insert into notafiscal (nome_emp, endereço, datavenda, cnpj, cod_cliente, cod_produto, quant_prod) values (?,?,?,?,?,?,?)";
        
        conexao = new ConexaoBD().conectaBD();
        
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objNotaFiscalDTO.getNome_emp());
            pstm.setString(2, objNotaFiscalDTO.getEndereco_emp());
            pstm.setString(3, objNotaFiscalDTO.getDataVenda());
            pstm.setString(4, objNotaFiscalDTO.getCnpj_emp());
            pstm.setString(5, objNotaFiscalDTO.getCod_cli());
            pstm.setString(6, objNotaFiscalDTO.getCod_prod());
            pstm.setString(7, objNotaFiscalDTO.getQuant_prod());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "NotaFiscalDAO" + erro);
        }
    }
}
