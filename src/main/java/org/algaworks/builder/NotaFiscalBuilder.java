package org.algaworks.builder;

import java.time.LocalDate;
import java.util.ArrayList;

public class NotaFiscalBuilder {

    private NotaFiscal instancia;

    public NotaFiscalBuilder() {}

    public NotaFiscalBuilder criarPessoaJuridicaBuilder() {
        instancia = new NotaFiscalPessoaJuridica();
        return this;
    }

    public NotaFiscalBuilder criarPessoaFisicaBuilder() {
        instancia = new NotaFiscalPessoaFisica();
        return this;
    }

    public NotaFiscalBuilder comNumero(String numero) {
        instancia.setNumero(numero);
        return this;
    }

    public NotaFiscalBuilder comData(String dataEmissao) {
        instancia.setDataEmissao(LocalDate.parse(dataEmissao));
        return this;
    }

    public NotaFiscalBuilder comItem(String nome, Integer quantidade, Double valor) {
        if (instancia.getItens() == null) {
            instancia.setItens(new ArrayList<>());
        }

        Produto produto = Produto.builder().comNome(nome).comQuantidade(quantidade).comValor(valor).build();
        instancia.getItens().add(produto);

        return this;
    }

    public NotaFiscal build() {
        return instancia;
    }

}
