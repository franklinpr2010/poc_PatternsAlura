package com.patterns.observer;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisCincoItens extends Desconto {
	
	
	public DescontoParaOrcamentoComMaisCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}
}
