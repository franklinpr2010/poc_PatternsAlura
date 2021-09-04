package com.patterns.chainofresponsability;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Desconto {
	protected Desconto proximo;
	public abstract BigDecimal calcular(Orcamento orcamento);
}
