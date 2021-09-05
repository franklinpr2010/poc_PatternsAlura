package com.patterns.decorator;

import java.math.BigDecimal;

import com.patterns.strategy.ICMS;
import com.patterns.strategy.ISS;
import com.patterns.strategy.Orcamento;

public class ICMSComIss {
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal icms = new ICMS().calcular(orcamento);
		BigDecimal iss = new ISS().calcular(orcamento);
		return icms.add(iss);
	}
}
