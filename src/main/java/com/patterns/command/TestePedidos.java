package com.patterns.command;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestePedidos {
	
	/**
	 * Tem uma representação de comando que precisa ser executado - Command
	 */
	public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);
        GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        gerador.executa();
        
	}
}
