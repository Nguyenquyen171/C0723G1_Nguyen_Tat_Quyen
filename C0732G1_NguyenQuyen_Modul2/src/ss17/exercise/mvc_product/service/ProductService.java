package ss17.exercise.mvc_product.service;

import ss17.exercise.mvc_product.model.Product;
import ss17.exercise.mvc_product.repository.ProductRepository;
import ss17.exercise.mvc_product.service.impl.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private final ProductRepository productRepository= new ProductRepository();

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public List<Product> displayProduct() {
        return productRepository.displayProduct();
    }

    @Override
    public List<Product> searchProduct(String name) {
        return productRepository.searchProduct(name);
    }
}
