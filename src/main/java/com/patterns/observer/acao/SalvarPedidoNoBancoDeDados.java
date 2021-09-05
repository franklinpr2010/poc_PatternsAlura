package com.patterns.observer.acao;

import com.patterns.observer.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {
	public void executar(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados!");
	}

}
