package org.algaworks.builder;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NotaFiscalPessoaJuridica extends NotaFiscal {

    @Override
    protected BigDecimal calcularImposto() {
        BigDecimal taxa = BigDecimal.valueOf(7);
        BigDecimal valor = this.getItens().stream().map(Produto::getValor).reduce(BigDecimal.ZERO, BigDecimal::add);
        return valor.multiply(taxa).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
    }

}
