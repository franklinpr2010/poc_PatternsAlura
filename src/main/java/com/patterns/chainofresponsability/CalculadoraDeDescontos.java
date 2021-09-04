package com.patterns.chainofresponsability;

import java.math.BigDecimal;


public class CalculadoraDeDescontos {
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoComMaisCincoItens(new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto()));
		return desconto.calcular(orcamento);
	}
}
