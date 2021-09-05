package com.patterns.observer.acao;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.patterns.observer.Orcamento;
import com.patterns.observer.Pedido;

public class GeradorPedidoHandler {
	
	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;
	private List<AcaoAposGerarPedido> acoes;
	
	/**
	 * Tem uma representação de comando que precisa ser executado - Command
	 */
	public void executa() {
		Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
		Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
		
		//EnviarEmail email = new EnviarEmail();
		//SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();
		//email.executar(pedido);
		//salvar.executar(pedido);
		acoes.forEach(a -> a.executar(pedido));
		
	}
	
	
	public GeradorPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}
}
