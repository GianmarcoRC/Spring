package es.gianmarco.ejemplos.appsspring.CommandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

//@Component
@Order(10)
public class ProcesoA implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.getClass().getCanonicalName());
    }
}
