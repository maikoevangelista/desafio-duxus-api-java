package controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.duxusdesafio.model.Time;
import repository.timesrepository;

@RestController
public class timescontroller {
	
	@Autowired
	private timesrepository timesrepository;
	
	@GetMapping(path = "api/times-id/{}")
	public ResponseEntity<Optional<Time>> buscartimesporID(
			@PathVariable(name = "id", required = true)long idtimes) {
		return ResponseEntity.ok( timesrepository.findById(idtimes));
	}

}
