package lesson4.service;

import lesson4.domain.ProductinShop;
import lesson4.repository.ProductJPA;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private ProductJPA productJPA;

    public ProductService(ProductJPA productJPA){this.productJPA=productJPA;}

    public ProductinShop getById(Long id){
        return productJPA.findAllById(id);
    }

    public List<ProductinShop> getAll(){
        List<ProductinShop> products = productJPA.findAll();
        products.sort(Comparator.comparingLong(ProductinShop::getId));
        return products;
    }

    public ProductinShop getmaxPrice(){
        return productJPA.findMax();
    }

    public ProductinShop getminPrice(){
        return productJPA.findMin();
    }

       public void save(ProductinShop product){
        productJPA.saveProduct(product.getTitle(), product.getPrice());
    }
}
