package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class integrantescontroller {
	
	@GetMapping(path = "api/intregantes-id/{}")
	public void buscarintegrantesporId() {
		
	}

}
