package DTO;

public class ProdutoDTO{
    private String nome_produto, valor_produto;
    private int cod_produto, quantidade_produto;

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getValor_produto() {
        return valor_produto;
    }

    public void setValor_produto(String valor_produto) {
        this.valor_produto = valor_produto;
    }

    public int getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    public int getQuantidade_produto() {
        return quantidade_produto;
    }

    public void setQuantidade_produto(int quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }
   
            
}
