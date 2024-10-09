import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> products = new ArrayList<>();
    private double total = 0;

    public void addProduct(Product product) {
        products.add(product);
        total += product.getPrice();
    }

    public double calculateDiscount() {
        double discount = 0;
        for (Product product : products) {
            discount += product.getDiscount();
        }
        return discount;
    }

    public void displayCart() {
        System.out.println("Products in the cart:");
        for (Product product : products) {
            double discount = product.getDiscount();
            System.out.println(product.getName() + ": $" + product.getPrice() + " (Discount: $" + discount + ")");
        }

        double discount = calculateDiscount();
        System.out.println("Total price: $" + total);
        System.out.println("Total discount: $" + discount);
        System.out.println("Final total: $" + (total - discount));
    }
}

