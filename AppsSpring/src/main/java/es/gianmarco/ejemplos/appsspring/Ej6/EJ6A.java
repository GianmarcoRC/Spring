package es.gianmarco.ejemplos.appsspring.Ej6;

import es.gianmarco.ejemplos.appsspring.EJ5.MessageService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class EJ6A implements CommandLineRunner {
    private final MessageService messageService;

    public EJ6A(@Qualifier("systemErrMessageService") MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage(this.getClass().getCanonicalName());
    }
}
