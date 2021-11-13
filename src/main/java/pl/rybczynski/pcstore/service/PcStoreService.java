package pl.rybczynski.pcstore.service;

import org.springframework.stereotype.Service;
import pl.rybczynski.pcstore.model.Component;
import pl.rybczynski.pcstore.model.ComponentType;
import pl.rybczynski.pcstore.model.Computer;
import pl.rybczynski.pcstore.repository.ComputerRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class PcStoreService {

    private final ComputerRepository repository;

    public PcStoreService(ComputerRepository repository) { this.repository = repository;}

    public Computer buildExampleComputer() {
        Component ram = new Component(null, "kosc ram 4GB", "DDR4", BigDecimal.valueOf(200), ComponentType.RAM);
        Component ram2 = new Component(null, "kosc ram 4GB", "DDR4", BigDecimal.valueOf(200), ComponentType.RAM);

       return repository.save(new Computer(null, "lao gan ma2", 21.0, List.of(ram, ram2)));
    }

    public Computer buildExampleComputer(String name) {
//        Component ram = new Component(1, "kosc ram 4GB", "DDR4", BigDecimal.valueOf(200), ComponentType.RAM);
//        Component ram2 = new Component(2, "kosc ram 4GB", "DDR4", BigDecimal.valueOf(200), ComponentType.RAM);

        return repository.save(new Computer(null, name, 21.0, null));
    }

    public List<Computer> getAll() {
        return repository.findAll();
    }

    public Computer findById(Long id){
        return repository.findById(id).orElseGet(null);
    }
}
