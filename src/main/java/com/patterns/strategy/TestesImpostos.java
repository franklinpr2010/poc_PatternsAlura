package com.patterns.strategy;

import java.math.BigDecimal;

import com.patterns.orcamento.Orcamento;

public class TestesImpostos {
	
	/**
	 * Sempre que tem um algoritmo que varia de acordo com um determinado parametro
	 * Quando se tem código que tem muito if e else para eliminar isso pode usar o strategy
	 * Cada classe tem uma estratégia de cálculo especifico
	 * @param args
	 */
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
		System.out.println(calculadora.calcular(orcamento, new ISS()));
	}
}
