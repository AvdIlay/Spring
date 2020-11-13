package lesson6.service;

import lesson6.domain.ProductinShop;
import lesson6.repository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImplDAO implements ProductService {

    private ProductDAO productDAO;

    public ProductImplDAO(){

    }
    public ProductImplDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public List<ProductinShop> getAll() {
        return productDAO.findAll();
    }

    @Override
    public ProductinShop getById(Long id) {
        return productDAO.findById(id).orElse(null);
    }

    @Override
    public ProductinShop save(ProductinShop product) {
        return productDAO.save(product);
    }

    @Override
    public List<ProductinShop> getByPrice(double priceFrom, double priceTo) {
        return productDAO.findAllByPriceBetween(priceFrom, priceTo);
    }
}