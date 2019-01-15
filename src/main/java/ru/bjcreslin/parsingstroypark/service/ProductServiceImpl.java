package service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bjcreslin.parsingstroypark.model.Product;
import ru.bjcreslin.parsingstroypark.repository.ProductRepository;

import java.util.List;

/**
 * Implamentation for service {@link ProductService}
 */
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product getById(Long id) {
        log.info("In ProductServiceImpl getById  id={}", id);
        return productRepository.getOne(id);
    }

    @Override
    public void deleteById(Long id) {
        log.info("In ProductServiceImpl deleteById  id={}", id);
        productRepository.deleteById(id);

    }

    @Override
    public void delete(Product product) {
        log.info("In ProductServiceImpl delete  product={}", product);
        productRepository.delete(product);
    }

    @Override
    public void save(Product product) {
        log.info("In ProductServiceImpl save  product={}", product);
        productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        log.info("In ProductServiceImpl getAll");
        return productRepository.findAll();
    }
}
