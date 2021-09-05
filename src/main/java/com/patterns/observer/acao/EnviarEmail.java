package com.patterns.observer.acao;

import com.patterns.observer.Pedido;

public class EnviarEmail implements AcaoAposGerarPedido {
	public void executar(Pedido pedido) {
		System.out.println("Enviando e-mail com dados do pedido!");
	}
}
