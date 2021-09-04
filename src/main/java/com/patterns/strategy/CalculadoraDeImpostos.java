package com.patterns.strategy;

import java.math.BigDecimal;

import com.patterns.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	
	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
		return tipoImposto.calcular(orcamento);
	}
}
