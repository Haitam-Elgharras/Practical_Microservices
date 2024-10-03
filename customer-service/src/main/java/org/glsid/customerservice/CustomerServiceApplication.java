package org.glsid.customerservice;

import org.glsid.customerservice.entities.Customer;
import org.glsid.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(new Customer(null, "Hassan", "hassan@gmail.com"));
            customerRepository.save(new Customer(null, "Mohamed", "mohamed@gmail.com"));
            customerRepository.save(new Customer(null, "haitam", "haitam@gmail.com"));
            customerRepository.save(new Customer(null, "lamyae", "lamyae@gmail.com"));
            customerRepository.save(new Customer(null, "soufian", "soufian@gmail.com"));
        };
    }

}
