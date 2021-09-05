package com.patterns.command;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor	
public class Pedido {
	private String cliente;
	private LocalDateTime data;
	private Orcamento orcamento;
	
}
