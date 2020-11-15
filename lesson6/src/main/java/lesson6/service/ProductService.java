package lesson6.service;

import lesson6.domain.ProductinShop;


import java.util.List;


public interface ProductService {
    List<ProductinShop> getAll();

    ProductinShop getById(Long id);

    ProductinShop save(ProductinShop product);

    List<ProductinShop> getByPrice(double priceFrom, double priceTo);

    List<ProductinShop> update(ProductinShop product);

    List<ProductinShop> getByPages(int id);
}
