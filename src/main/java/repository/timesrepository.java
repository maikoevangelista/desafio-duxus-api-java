package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.duxusdesafio.model.Time;

public interface timesrepository 
        extends JpaRepository<Time, Long> {

}
