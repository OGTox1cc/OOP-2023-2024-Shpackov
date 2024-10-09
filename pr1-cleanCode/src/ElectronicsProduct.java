public class ElectronicsProduct extends Product {
    public ElectronicsProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return price * 0.15;
    }
}

