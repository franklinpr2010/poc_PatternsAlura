package com.patterns.strategy;

import java.math.BigDecimal;

import com.patterns.orcamento.Orcamento;

public class ISS implements TipoImposto{
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.6"));
	}
}
