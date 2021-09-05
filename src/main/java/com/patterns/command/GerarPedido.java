package com.patterns.command;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GerarPedido {
	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;
	
	/**
	 * Tem uma representação de comando que precisa ser executado - Command
	 */
	public void executa() {
		Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
		Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
		System.out.println("salvar pedido no banco de dados!");
		System.out.println("enviar email com dados do pedido!!");
	}
}
