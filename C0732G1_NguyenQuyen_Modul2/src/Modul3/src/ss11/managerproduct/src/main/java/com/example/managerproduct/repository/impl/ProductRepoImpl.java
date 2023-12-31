package com.example.managerproduct.repository.impl;

import com.example.managerproduct.model.Product;
import com.example.managerproduct.repository.IProductRepo;

import java.util.ArrayList;
import java.util.List;

public class ProductRepoImpl implements IProductRepo {
    private static final List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"Corvette Stingray", 80000, "Blue", "Chevrolet"));
        productList.add(new Product(2,"Spectre", 422000, "2024", "Rolls-Royce"));
        productList.add(new Product(3,"Maybach", 195000, "S-Class", "Mercedes"));
        productList.add(new Product(4,"Flying Spur", 215000, "Orange 2024", "Bentley"));
    }
    @Override
    public List<Product> displayList() {
//        productList.removeIf(p -> p.getId() == -1);
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        product.setId(productList.get(productList.size() - 1).getId() + 1);
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void editProduct(Product product) {
        for (Product prod : productList) {
            if (prod.getId() == product.getId()) {
                productList.set(productList.indexOf(prod), product);
                return;
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        for (int i = 0; i < productList.size(); i++){
            if (productList.get(i).getId() == id) {
                productList.remove(productList.get(i));
                return;
            }
        }
    }
    @Override
    public List<Product> findByName(String name) {
        List<Product> productList1 = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                productList1.add(product);
            }
        }
        return productList1;
    }
}