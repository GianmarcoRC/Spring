package es.gianmarco.ejemplos.appsspring.EJ5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class EJ5B implements CommandLineRunner {
    //Implementacion por atributo

    private final MessageService messageService;

    public EJ5B(@Qualifier("systemOutMessageService") MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage(this.getClass().getCanonicalName());
    }
}
