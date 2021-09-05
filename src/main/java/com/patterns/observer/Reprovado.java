package com.patterns.observer;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
 }
