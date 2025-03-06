package org.algaworks;

import org.algaworks.builder.NotaFiscal;
import org.algaworks.builder.NotaFiscalBuilder;

public class Main {
    public static void main(String[] args) {
        NotaFiscal buildPessoaFisica = new NotaFiscalBuilder()
                .criarPessoaFisicaBuilder()
                .comNumero("123")
                .comData("2020-01-01")
                .comItem("Item 1", 1, 100.0)
                .comItem("Item 2", 2, 200.0)
                .build();

        System.out.println(buildPessoaFisica.getValorImposto());

        NotaFiscal buildPessoaJuridica = new NotaFiscalBuilder()
                .criarPessoaJuridicaBuilder()
                .comNumero("123")
                .comData("2020-01-01")
                .comItem("Item 1", 1, 100.0)
                .comItem("Item 2", 2, 200.0)
                .build();

        System.out.println(buildPessoaJuridica.getValorImposto());
    }
}