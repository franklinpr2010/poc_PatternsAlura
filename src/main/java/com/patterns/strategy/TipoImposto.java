package com.patterns.strategy;

import java.math.BigDecimal;


public interface TipoImposto {
	BigDecimal calcular(Orcamento orcamento);
}
