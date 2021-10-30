package pl.rybczynski.pcstore.infrastructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rybczynski.pcstore.model.Computer;
import pl.rybczynski.pcstore.service.PcStoreService;

@RestController
@RequestMapping("/computer")
public class ComputerController {

    private PcStoreService pcStoreService;

    public ComputerController(PcStoreService pcStoreService) {
        this.pcStoreService = pcStoreService;
    }

    @GetMapping("/example")
    public ResponseEntity<Computer> getExampleComputer() {
        return ResponseEntity.ok(pcStoreService.buildExampleComputer());
    }

    @GetMapping("/example2")
    public ResponseEntity<Computer> getExampleComputer2() {
        return ResponseEntity.ok(pcStoreService.buildExampleComputer("elo"));
    }
}
