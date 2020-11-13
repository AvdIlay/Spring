package lesson6.repository;

import lesson6.domain.ProductinShop;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ProductDAO extends JpaRepository<ProductinShop, Long> {
    List<ProductinShop> findAllByPriceBetween(Double startPrice, Double endPrice);
}
