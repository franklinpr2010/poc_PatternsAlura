package com.patterns.observer;

import java.math.BigDecimal;
import java.util.List;

import com.patterns.observer.acao.AcaoAposGerarPedido;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GerarPedido {
	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;
	private List<AcaoAposGerarPedido> acoes;

	public GerarPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
	}
}
