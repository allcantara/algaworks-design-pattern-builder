package org.algaworks.builder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public abstract class NotaFiscal {

    private String numero;
    private LocalDate dataEmissao;
    private List<Produto> itens;

    protected abstract BigDecimal calcularImposto();

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }

    public BigDecimal getValorImposto() {
        return calcularImposto();
    }

    public NotaFiscalBuilder builder() {
        return new NotaFiscalBuilder();
    }

}
