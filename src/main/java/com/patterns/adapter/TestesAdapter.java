package com.patterns.adapter;

import java.math.BigDecimal;

import com.patterns.observer.Orcamento;

public class TestesAdapter {
	public static void main(String[] args) {
		Orcamento orc = new Orcamento(BigDecimal.TEN, 1);
		orc.aprovar();
		orc.finalizar();
		RegistrarOrcamento registro = new RegistrarOrcamento(new JavaHttpClient());
		registro.registrar(orc);
	}
}
