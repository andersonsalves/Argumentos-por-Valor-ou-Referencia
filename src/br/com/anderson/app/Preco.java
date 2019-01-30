package br.com.anderson.app;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Anderson Silva
 */
public class Preco {
    
    private BigDecimal valorCusto;
    private BigDecimal valorImposto;
    private BigDecimal valorLucro;
    private BigDecimal precoVenda;
    
    // Getters e Setters

    public BigDecimal getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(BigDecimal valorCusto) {
        this.valorCusto = valorCusto.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(BigDecimal valorImposto) {
        this.valorImposto = valorImposto.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal getValorLucro() {
        return valorLucro;
    }

    public void setValorLucro(BigDecimal valorLucro) {
        this.valorLucro = valorLucro.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda.setScale(2, RoundingMode.DOWN);
    }   
}
