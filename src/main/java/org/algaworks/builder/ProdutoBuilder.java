package org.algaworks.builder;

import java.math.BigDecimal;

public class ProdutoBuilder {

    private final Produto instancia;

    public ProdutoBuilder() {
        this.instancia = new Produto();
    }

    public ProdutoBuilder comNome(String nome) {
        instancia.setNome(nome);
        return this;
    }

    public ProdutoBuilder comQuantidade(Integer quantidade) {
        instancia.setQuantidade(quantidade);
        return this;
    }

    public ProdutoBuilder comValor(Double valor) {
        instancia.setValor(BigDecimal.valueOf(valor));
        return this;
    }

    public Produto build() {
        return instancia;
    }

}
