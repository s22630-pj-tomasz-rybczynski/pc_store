package pl.rybczynski.pcstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.rybczynski.pcstore.application.Component;
import pl.rybczynski.pcstore.application.ComponentType;
import pl.rybczynski.pcstore.application.Computer;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class PcstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcstoreApplication.class, args);
	}

}
