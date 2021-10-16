package pl.rybczynski.pcstore.infrastructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rybczynski.pcstore.application.Component;
import pl.rybczynski.pcstore.application.ComponentType;
import pl.rybczynski.pcstore.application.Computer;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/computer")
public class ComputerController {

    @GetMapping("/example")
    public ResponseEntity<Computer> getExampleComputer() {
        Component ram = new Component(1, "kosc ram 4GB", "DDR4", BigDecimal.valueOf(200), ComponentType.RAM);
        Component ram2 = new Component(2, "kosc ram 4GB", "DDR4", BigDecimal.valueOf(200), ComponentType.RAM);

        Computer comp = new Computer(1, "lao gan ma", 21.0, List.of(ram, ram2));
        return ResponseEntity.ok(comp);
    }
}
