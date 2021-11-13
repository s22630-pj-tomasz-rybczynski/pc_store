package pl.rybczynski.pcstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rybczynski.pcstore.model.Computer;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long> {
}
