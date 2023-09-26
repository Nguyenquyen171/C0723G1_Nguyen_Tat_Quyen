package ss17.exercise.mvc_product.controller;

import ss17.exercise.mvc_product.model.Product;
import ss17.exercise.mvc_product.service.ProductService;

import java.util.List;

public class ProductController {
    private final ProductService productService= new ProductService();

    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    public List<Product> displayProduct() {
        return productService.displayProduct();
    }

    public List<Product> searchProduct(String name) {
        return productService.searchProduct(name);
    }
}
