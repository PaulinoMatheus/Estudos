package br.com.alura.TabelaFipe;

import br.com.alura.TabelaFipe.principal.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TabelaFipeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TabelaFipeApplication.class, args);

        Principal principal = new Principal();
        principal.exibeMenu();
	}

}
