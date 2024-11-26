package es.gianmarco.ejemplos.appsspring.EJ7;

import es.gianmarco.ejemplos.appsspring.EJ5.MessageService;
import es.gianmarco.ejemplos.appsspring.beans.Contador;
import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class EJ7A implements CommandLineRunner {
    private final Faker faker;
    private final MessageService messageService;
    private final Contador countador;

    public EJ7A(Faker faker, MessageService messageService, Contador countador) {
        this.faker = faker;
        this.messageService = messageService;
        this.countador = countador;
    }

    @Override
    public void run(String... args) throws Exception {
    messageService.showMessage(" Personaje " + faker.backToTheFuture().character());
    for (int i = 0; i < 10; i++) {
        countador.incrementar();
    }
        System.out.println(countador.getContador());
    }
}
