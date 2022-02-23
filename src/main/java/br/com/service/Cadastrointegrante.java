package br.com.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.duxusdesafio.model.Integrante;
import repository.Integrantesrepository;

public class Cadastrointegrante {
	@Autowired
	private Integrantesrepository integrantesrepository;
	
	public void cadastro(Integrante integrante) {
		integrantesrepository.saveAndFlush(integrante);
	}

}
