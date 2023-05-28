package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
    Connection conexao;
    PreparedStatement pstm;
    
    public void cadastrarCliente(ClienteDTO objClienteDTO) throws SQLException {
        String sql = "insert into cliente (nome, cpf, email, endereço, dado_pagamento) values (?,?,?,?,?)";
        
        conexao = new ConexaoBD().conectaBD();
        
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objClienteDTO.getNome_cliente());
            pstm.setString(2, objClienteDTO.getCpf_cliente());
            pstm.setString(3, objClienteDTO.getEmail_cliente());
            pstm.setString(4, objClienteDTO.getEndereco_cliente());
            pstm.setString(5, objClienteDTO.getPagamento_cliente());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO" + erro);
        }
    
    }
    
}
