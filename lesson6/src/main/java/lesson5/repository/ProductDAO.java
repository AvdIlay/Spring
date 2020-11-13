package lesson5.repository;

import lesson5.domain.ProductinShop;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<ProductinShop, Long> {
    List<ProductinShop> findAllByPriceBetween(Double startPrice, Double endPrice);
}
