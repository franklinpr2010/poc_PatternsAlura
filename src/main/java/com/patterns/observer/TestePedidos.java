package com.patterns.observer;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

import com.patterns.observer.acao.EnviarEmail;
import com.patterns.observer.acao.GeradorPedidoHandler;
import com.patterns.observer.acao.SalvarPedidoNoBancoDeDados;

public class TestePedidos {
	
	/**
	 * Observer
	 */
	public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);
        GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        GeradorPedidoHandler handler = new GeradorPedidoHandler(Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmail() ));
        handler.executa();
	}
	
	
}
