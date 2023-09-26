package ss17.exercise.mvc_product.service.impl;

import ss17.exercise.mvc_product.model.Product;

import java.util.List;

public interface IProductService {
    public void addProduct(Product product);
    public List<Product> searchProduct(String nameProduct);
    public List<Product> displayProduct();

}
