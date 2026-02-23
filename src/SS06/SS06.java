package SS06;

import java.util.*;
class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}

public class SS06{
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Mouse", 20));
        products.add(new Product("Keyboard", 50));
        products.add(new Product("Monitor", 300));

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price, p2.price);
            }
        });

        System.out.println("Danh sách sắp xếp theo giá (tăng dần) - Anonymous Class:");
        for (Product p : products) {
            System.out.println(p);
        }

        System.out.println();

        Collections.sort(products, (p1, p2) -> p1.name.compareTo(p2.name));

        System.out.println("Danh sách sắp xếp theo tên (A-Z) - Lambda:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}