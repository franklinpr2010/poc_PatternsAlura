package com.patterns.observer;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser finalizado!");
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser aprovado!");
	}
	
	
}
