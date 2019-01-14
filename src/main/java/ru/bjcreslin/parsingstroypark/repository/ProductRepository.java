package ru.bjcreslin.parsingstroypark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bjcreslin.parsingstroypark.model.Product;

/**
 * repo for product
 */

public interface ProductRepository extends JpaRepository<Product,Long> {

}
