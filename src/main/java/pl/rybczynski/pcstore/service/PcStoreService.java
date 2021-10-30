package pl.rybczynski.pcstore.service;

import org.springframework.stereotype.Service;
import pl.rybczynski.pcstore.model.Component;
import pl.rybczynski.pcstore.model.ComponentType;
import pl.rybczynski.pcstore.model.Computer;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PcStoreService {

    public Computer buildExampleComputer() {
        Component ram = new Component(1, "kosc ram 4GB", "DDR4", BigDecimal.valueOf(200), ComponentType.RAM);
        Component ram2 = new Component(2, "kosc ram 4GB", "DDR4", BigDecimal.valueOf(200), ComponentType.RAM);

       return new Computer(1, "lao gan ma", 21.0, List.of(ram, ram2));
    }

    public Computer buildExampleComputer(String name) {
        Component ram = new Component(1, "kosc ram 4GB", "DDR4", BigDecimal.valueOf(200), ComponentType.RAM);
        Component ram2 = new Component(2, "kosc ram 4GB", "DDR4", BigDecimal.valueOf(200), ComponentType.RAM);

        return new Computer(1, name, 21.0, List.of(ram, ram2));
    }
}
