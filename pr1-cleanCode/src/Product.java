public class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getDiscount() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

