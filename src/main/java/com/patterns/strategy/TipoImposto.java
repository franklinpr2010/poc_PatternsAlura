package com.patterns.strategy;

import java.math.BigDecimal;

import com.patterns.orcamento.Orcamento;

public interface TipoImposto {
	BigDecimal calcular(Orcamento orcamento);
}
