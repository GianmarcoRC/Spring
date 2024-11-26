package es.gianmarco.ejemplos.appsspring.EJ7;

import es.gianmarco.ejemplos.appsspring.EJ5.MessageService;
import es.gianmarco.ejemplos.appsspring.beans.Contador;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class EJ7B implements CommandLineRunner {
    private final Faker faker;
    private final MessageService messageService;
    private final Contador contador1;

    public EJ7B(Faker faker, @Qualifier("systemOutMessageService") MessageService messageService, Contador contador1) {
        this.faker = faker;
        this.messageService = messageService;
        this.contador1 = contador1;
    }

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage(" Personaje " + faker.bigBangTheory().character());

      for (int i = 0; i < 10; i++) {

          contador1.incrementar();
      }
        System.out.println(contador1.getContador());

    }
}
