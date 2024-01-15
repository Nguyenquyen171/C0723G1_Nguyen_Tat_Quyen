package com.example.exercise_1.repository;

import com.example.exercise_1.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "Fridge", 200, "new", "China"));
        productMap.put(2, new Product(2, "TV", 500, "new", "Singapore"));
        productMap.put(3, new Product(3, "Air-conditioner", 1000, "new", "China"));
        productMap.put(4, new Product(4, "Fan", 100, "new", "USA"));
    }

    @Override
    public List<Product> showList() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void create(Product product) {
        productMap.put(product.getId(),product);

    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id,product);

    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> searchByName(String nameProduct) {
        List<Product> productList= new ArrayList<>();
        for (Map.Entry<Integer,Product> entry: productMap.entrySet()){
            if (entry.getValue().getName().contains(nameProduct)){
                productList.add(entry.getValue());
            }
        }
        return productList;
    }
}
