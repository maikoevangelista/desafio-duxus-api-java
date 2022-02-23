package controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.duxusdesafio.model.Integrante;
import repository.Integrantesrepository;

@RestController
public class integrantescontroller {
	
	@Autowired
	private Integrantesrepository integrantesrepository;
	
	@GetMapping(path = "api/intregantes-id/{}")
	public ResponseEntity<Optional<Integrante>> buscarintegrantesporId(
			@PathVariable(name = "id", required = true)long idintegrantes) {
		return ResponseEntity
				.ok(integrantesrepository.findById(idintegrantes));
	}

}
