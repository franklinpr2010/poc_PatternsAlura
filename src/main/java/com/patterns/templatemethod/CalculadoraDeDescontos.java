package com.patterns.templatemethod;

import java.math.BigDecimal;


public class CalculadoraDeDescontos {
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisCincoItens(new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto()));
		return cadeiaDeDescontos.efetuarCalculo(orcamento);
	}
}
