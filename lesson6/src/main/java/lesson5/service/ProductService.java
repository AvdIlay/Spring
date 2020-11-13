package lesson5.service;

import lesson5.domain.ProductinShop;
import org.springframework.stereotype.Service;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public interface ProductService {
    List<ProductinShop> getAll();

    ProductinShop getById(Long id);

    ProductinShop save(ProductinShop product);

    List<ProductinShop> getByPrice(double priceFrom, double priceTo);
}