package br.com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.duxusdesafio.model.Time;
import repository.timesrepository;

public class CadastroTimes {
	@Autowired
	private timesrepository timesrepository;
	
	public void Cadastro(Time time) {
		timesrepository.saveAndFlush(time);
	
	}

}
