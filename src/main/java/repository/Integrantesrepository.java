package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.duxusdesafio.model.Integrante;

public interface Integrantesrepository extends JpaRepository<Integrante, Long> {

}
