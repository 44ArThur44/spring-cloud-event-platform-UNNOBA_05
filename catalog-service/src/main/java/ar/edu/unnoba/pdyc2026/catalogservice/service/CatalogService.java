package ar.edu.unnoba.pdyc2026.catalogservice.service;

import ar.edu.unnoba.pdyc2026.catalogservice.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {
    public List<ProductDto> getProducts() {
        return List.of(
                new ProductDto(1L, "Cámara", "Cámara digital para estudio"),
                new ProductDto(2L, "Libro", "Libro de programación Java")
        );
    }
}
