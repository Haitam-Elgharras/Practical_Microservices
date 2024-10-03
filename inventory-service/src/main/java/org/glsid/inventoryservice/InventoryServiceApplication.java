package org.glsid.inventoryservice;

import org.glsid.inventoryservice.entities.Product;
import org.glsid.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(new Product(null, "Computer", 900, 5));
            productRepository.save(new Product(null, "Printer", 300, 2));
            productRepository.save(new Product(null, "Smartphone", 400, 3));
        };
    }
}
