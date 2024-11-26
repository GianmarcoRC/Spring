package es.gianmarco.ejemplos.appsspring.CommandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;

//@Component
public class ProcesoC implements CommandLineRunner, Ordered {


    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.getClass().getCanonicalName());
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
