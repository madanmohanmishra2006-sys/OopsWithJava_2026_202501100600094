
package OopsWithJava_2026_202501100600094;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return productId + "  " + productName + "  " + price;
    }
}

class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {

        // Sort by price: highest to lowest
        if (o1.price != o2.price) {
            return Double.compare(o2.price, o1.price);
        }

        // If prices are equal, sort by name alphabetically
        return o1.productName.compareToIgnoreCase(o2.productName);
    }
}

public class Sorting2 {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(101, "Laptop", 6000));
        products.add(new Product(102, "Mobile", 6000));
        products.add(new Product(103, "Tablet", 3000));
        products.add(new Product(104, "Mouse", 1000));

        // Sort products using Comparator
        Collections.sort(products, new ProductComparator());

        // Display sorted products
        System.out.println("Product ID  Product Name  Price");
        System.out.println("--------------------------------");

        for (Product p : products) {
            System.out.println(p);
        }
    }
}
