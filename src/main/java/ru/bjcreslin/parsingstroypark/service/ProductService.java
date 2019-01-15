package service;

import ru.bjcreslin.parsingstroypark.model.Product;

import java.util.List;

/**
 * interface service for {@link Product}
 */

public interface ProductService {

    Product getById(Long id);

    void deleteById(Long id);

    void delete(Product product);

    void save(Product product);

    List<Product> getAll();
}
