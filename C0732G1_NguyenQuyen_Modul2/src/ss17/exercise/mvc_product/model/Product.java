package ss17.exercise.mvc_product.model;

public class Product {
    private int idProduct;
    private String nameProduct;
    private double priceProduct;
    private String manufacturerProduct;
    private String describe;

    public Product(int idFan, String nameProduct, double priceFan, String manufacturerFan, String describe) {
        this.idProduct = idFan;
        this.nameProduct = nameProduct;
        this.priceProduct = priceFan;
        this.manufacturerProduct = manufacturerFan;
        this.describe = describe;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getManufacturerProduct() {
        return manufacturerProduct;
    }

    public void setManufacturerProduct(String manufacturerProduct) {
        this.manufacturerProduct = manufacturerProduct;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
