package thi_tot.model;

public class Iphone {
    private String id;
    private String name;
    private int year;
    private String from;
    private double price;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Iphone(String id, String name, int year, String from, double price) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.from = from;
        this.price = price;
    }
    public Iphone(){}

    @Override
    public String toString() {
        return "Iphone{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", from='" + from + '\'' +
                ", price=" + price +
                '}';
    }
}
