package com.patterns.adapter;

import java.util.HashMap;
import java.util.Map;

import com.patterns.observer.DomainException;
import com.patterns.observer.Orcamento;

public class RegistrarOrcamento {
	
	private HttpAdapter http;
	
	public RegistrarOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {
		if(!orcamento.isFinalizado()) {
			throw new DomainException("Orçamento não finalizado!");
		}
		
		String url= "http://api.externa/orcamento";
		Map<String, Object> dados = new HashMap<>();
		dados.put("valor", orcamento.getValor());
		dados.put("quantidadeItens", orcamento.getQuantidadeItens());
		// chamada http para api externa
		http.post(url, dados);
		
		
	}
}
