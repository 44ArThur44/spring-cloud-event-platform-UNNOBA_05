package ar.edu.unnoba.pdyc2026.catalogservice.repository;

import ar.edu.unnoba.pdyc2026.catalogservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
