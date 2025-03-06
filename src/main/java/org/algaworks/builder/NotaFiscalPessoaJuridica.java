package org.algaworks.builder;

import java.math.BigDecimal;

public class NotaFiscalPessoaJuridica extends NotaFiscal {

    @Override
    protected BigDecimal calcularImposto() {
        return BigDecimal.ONE;
    }

}
