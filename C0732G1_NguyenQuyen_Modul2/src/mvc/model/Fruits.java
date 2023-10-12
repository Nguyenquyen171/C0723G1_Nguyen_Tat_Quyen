package mvc.model;

public class Fruits {
    private String id;
    private String name;
    private String from;
    private int quantity;
    private double price;

    public Fruits(String id, String name, String from, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.from = from;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", from='" + from + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
    public Fruits(){

    }
}
