package es.gianmarco.ejemplos.appsspring.Configuraciones;

import es.gianmarco.ejemplos.appsspring.EJ5.MessageService;
import es.gianmarco.ejemplos.appsspring.EJ5.SystemOutMessageService;
import es.gianmarco.ejemplos.appsspring.Ej6.SystemErrMessageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageServiceConfig {

    @Value("${message.service.type:systemOut}")
    private String messageServiceType;

    @Bean(name = "messageService")
    public MessageService messageService() {
        if ("systemErr".equalsIgnoreCase(messageServiceType)) {
            return new SystemErrMessageService();
        } else {
            return new SystemOutMessageService();
        }
    }
}