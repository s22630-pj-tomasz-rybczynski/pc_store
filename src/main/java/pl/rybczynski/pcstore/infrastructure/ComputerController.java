package pl.rybczynski.pcstore.infrastructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.rybczynski.pcstore.model.Computer;
import pl.rybczynski.pcstore.service.PcStoreService;

import java.util.List;

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

    @GetMapping("/all")
    public ResponseEntity<List<Computer>> getAll() {
        return ResponseEntity.ok(pcStoreService.getAll());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Computer> getById(@PathVariable Long id) {
        return ResponseEntity.ok(pcStoreService.findById(id));
    }
}
