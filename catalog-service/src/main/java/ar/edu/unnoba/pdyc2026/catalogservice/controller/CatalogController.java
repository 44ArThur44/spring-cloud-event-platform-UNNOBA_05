package ar.edu.unnoba.pdyc2026.catalogservice.controller;

import ar.edu.unnoba.pdyc2026.catalogservice.dto.ProductDto;
import ar.edu.unnoba.pdyc2026.catalogservice.service.CatalogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    private final CatalogService catalogService;

    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/products")
    public List<ProductDto> findProducts() {
        return catalogService.getProducts();
    }
}
