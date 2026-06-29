package ar.edu.unnoba.pdyc2026.catalogservice;

import ar.edu.unnoba.pdyc2026.catalogservice.model.Product;
import ar.edu.unnoba.pdyc2026.catalogservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final ProductRepository productRepository;

    public BootstrapData(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) {
        if (productRepository.count() == 0) {
            productRepository.save(new Product("Cámara", "Cámara digital para estudio"));
            productRepository.save(new Product("Libro", "Libro de programación Java"));
        }
    }
}
