package es.gianmarco.ejemplos.appsspring.Configuraciones;

import net.datafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakerConfig {

    @Bean
    public Faker fakerBean() {
        return new Faker();
    }
}
