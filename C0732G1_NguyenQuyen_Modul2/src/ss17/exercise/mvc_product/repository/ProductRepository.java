package ss17.exercise.mvc_product.repository;

import ss17.exercise.mvc_product.file_ultils.FileUtils;
import ss17.exercise.mvc_product.model.Product;
import ss17.exercise.mvc_product.repository.impl.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public static final String COMMA = ",";

    // CSV => Comma Separated Values
    private final String pathFileData = "/Users/nguyentatquyen/Documents/GitHub/C0723G1_Nguyen_Tat_Quyen/C0732G1_NguyenQuyen_Modul2/src/ss17/exercise/binary_system/view/product.csv";

    /**
     * CRUD => C, U, D
     *
     * Read data from file
     * Dev handle
     * Write data to file
     *
     * */

    @Override
    public void addProduct(Product product) {
        List<Product> products= this.displayProduct();
        products.add(product);
        FileUtils.writeFile(pathFileData,convertToStringList(products));
    }

    @Override
    public List<Product> displayProduct() {
        return convertToProductList(FileUtils.readFile(pathFileData));
    }

    @Override
    public List<Product> searchProduct(String name) {
        List<Product> products= this.displayProduct();
        List<Product> productSearch = new ArrayList<>();
        for(Product product: products) {
            if (product.getNameProduct().matches("(.*)"+name+"(.*)")){
                productSearch.add(product);
            }
        }
        return productSearch;
    }
    public List<String> convertToStringList(List<Product> products) {
        List<String> stringList = new ArrayList<>();
        for (Product product: products) {
            stringList.add(product.getIdProduct()
                    + COMMA +product.getNameProduct()
                    + COMMA +product.getPriceProduct()
                    + COMMA +product.getManufacturerProduct()
                    + COMMA +product.getDescribe());
        }
        return stringList;
    }
    public List<Product> convertToProductList(List<String> strings) {
        List<Product> products = new ArrayList<>();
        for (String string: strings) {
            String[] arrayProduct = string.split(COMMA);
            products.add(new Product(Integer.parseInt(arrayProduct[0]),arrayProduct[1],Double.parseDouble(arrayProduct[2]),arrayProduct[3],arrayProduct[4]));
        }
        return products;
    }
}
