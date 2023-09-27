package ss17.exercise.mvc_product.repository;

import ss17.exercise.mvc_product.model.Product;

import java.util.List;

public interface IProductRepository {
    public void addProduct(Product product);
    public List<Product> searchProduct(String nameProduct);
    public List<Product> displayProduct();
}
