package br.com.anderson.app;

import java.math.BigDecimal;

/**
 *
 * @author Anderson Silva
 */
public class Produto {    
    
    private String fabricante;
    private String nomeProduto;
    
    /**
     * Construtor.
     */
    public Produto() {
        
    }
    
    /**
     * 
     * @param preco
     * @param imposto
     * @param margeLucro 
     */
    void definirPreco(Preco preco, BigDecimal imposto, BigDecimal margeLucro) {
        
        preco.setValorImposto(preco.getValorCusto().multiply(imposto.divide(new BigDecimal(100))));
        preco.setValorLucro(preco.getValorCusto().multiply(margeLucro.divide(new BigDecimal(100))));
        preco.setPrecoVenda(preco.getValorCusto().add(preco.getValorImposto().add(preco.getValorLucro())));       
    }
    
    // Gettters e Setters 

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }   
}
