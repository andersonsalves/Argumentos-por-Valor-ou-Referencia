package br.com.anderson.app;

import java.math.BigDecimal;

/**
 *
 * @author Anderson Silva
 */
public class Main {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Preco preco = new Preco();
        preco.setValorCusto(new BigDecimal(32.80));

        Produto produto = new Produto();
        produto.setFabricante("Nike");
        produto.setNomeProduto("Boné");
        
        produto.definirPreco(preco, new BigDecimal(1.70), new BigDecimal(3.50));
        
        System.out.println("Produto: " + produto.getNomeProduto() + " - Fabricante: " + produto.getFabricante());
        System.out.println("Valor de Custo: " + preco.getValorCusto());
        System.out.println("Valor de Imposto: " + preco.getValorImposto());
        System.out.println("Valor de Lucro: " + preco.getValorLucro());
        System.out.println("Preço de Venda: " + preco.getPrecoVenda());        
    }    
}
