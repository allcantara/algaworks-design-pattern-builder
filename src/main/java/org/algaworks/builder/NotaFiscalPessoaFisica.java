package org.algaworks.builder;

import java.math.BigDecimal;

public class NotaFiscalPessoaFisica extends NotaFiscal {


    @Override
    protected BigDecimal calcularImposto() {
        return BigDecimal.TEN;
    }

}
