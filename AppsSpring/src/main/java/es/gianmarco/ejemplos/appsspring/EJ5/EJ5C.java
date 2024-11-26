package es.gianmarco.ejemplos.appsspring.EJ5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class EJ5C implements CommandLineRunner {

    private final MessageService messageService;

    public EJ5C(@Qualifier("systemOutMessageService") MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage(this.getClass().getCanonicalName());
    }
}
