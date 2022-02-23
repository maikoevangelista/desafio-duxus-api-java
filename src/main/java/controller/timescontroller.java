package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class timescontroller {
	
	@GetMapping(path = "api/times-id/{}")
	public void buscartimesporID() {
		
	}

}
