package br.com.fiap.cervejaria.controller;

import java.math.BigDecimal;

public class PrecoCervejaDTO {

    private BigDecimal preco;

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
