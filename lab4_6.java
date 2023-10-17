import java.util.Scanner;

class Product {
    private String productName;
    private String company;
    private int quantity;

    public Product(String productName, String company, int quantity) {
        this.productName = productName;
        this.company = company;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public String getCompany() {
        return company;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Amazon {
    public static double calculateCost(Product product) {
        double basePrice = getProductPrice(product);
        double discount = 0.0;

        // Apply HDFC credit card discount (10%)
        discount += 0.10 * basePrice;

        // Apply discount for purchase above 50,000 (15%)
        if (basePrice > 50000) {
            discount += 0.15 * basePrice;
        }

        return basePrice - discount;
    }

    private static double getProductPrice(Product product) {
        // Assume a base price for the product based on its quantity
        return 500 * product.getQuantity();  // Example base price: Rs. 500 per item
    }
}

class Flipkart {
    public static double calculateCost(Product product, boolean isRGUKTStudent) {
        double basePrice = getProductPrice(product);
        double discount = 0.0;

        // Apply RGUKT student discount (30%)
        if (isRGUKTStudent) {
            discount += 0.30 * basePrice;
        }

        // Apply discount for purchase above 30,000 (5%)
        if (basePrice > 30000) {
            discount += 0.05 * basePrice;
        }

        return basePrice - discount;
    }

    private static double getProductPrice(Product product) {
        // Assume a base price for the product based on its quantity
        return 600 * product.getQuantity();  // Example base price: Rs. 600 per item
    }
}

public class lab4_6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter company: ");
        String company = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(productName, company, quantity);

        // Assume the user is a RGUKT student for simplicity
        boolean isRGUKTStudent = true;

        double amazonCost = Amazon.calculateCost(product);
        double flipkartCost = Flipkart.calculateCost(product, isRGUKTStudent);

        System.out.println("Cost on Amazon: Rs." + amazonCost);
        System.out.println("Cost on Flipkart: Rs." + flipkartCost);

        if (amazonCost < flipkartCost) {
            System.out.println("Suggested to buy from Amazon.");
        } else {
            System.out.println("Suggested to buy from Flipkart.");
        }
    }
}

