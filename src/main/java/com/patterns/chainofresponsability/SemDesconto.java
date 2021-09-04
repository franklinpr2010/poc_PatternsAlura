package com.patterns.chainofresponsability;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {
	
	
	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
}
