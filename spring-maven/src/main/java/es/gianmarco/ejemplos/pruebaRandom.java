package es.gianmarco.ejemplos;

import net.datafaker.Faker;

public class pruebaRandom {
    public static void main(String[] args) {
        
       Faker faker = new Faker();

        System.out.println("Empresa random:" + faker.company().name());
        System.out.println("Email random:" + faker.internet().emailAddress());
        System.out.println("Personaje ramdom:" + faker.breakingBad().character());
    }
    


}
