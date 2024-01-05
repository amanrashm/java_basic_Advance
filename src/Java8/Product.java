package Java8;
import java.util.List;

public class Product {
    private int id;
    String name;
    float price;

    public Product() {
        super();
    }

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //getters and setters
    public String getName() {
        return this.name;
    }

    public static List<Product> getProducts() {
        List<Product> list = List.of(
                new Product(1, "HP Laptop", 25000f),
                new Product(2, "Dell Laptop", 30000f),
                new Product(3, "Lenevo Laptop", 28000f),
                new Product(4, "Sony Laptop", 28000f),
                new Product(5, "Apple Laptop", 90000f));
        return list;
    }

    //create list of 70 products
    public static List<Product> getProducts70() {
        List<Product> list = List.of(
                new Product(1, "HP Laptop", 25000f),
                new Product(2, "Dell Laptop", 30000f),
                new Product(3, "Lenevo Laptop", 28000f),
                new Product(4, "Sony Laptop", 28000f),
                new Product(5, "Apple Laptop", 90000f),
                new Product(6, "HP Laptop", 25000f),
                new Product(7, "Dell Laptop", 30000f),
                new Product(8, "Lenevo Laptop", 28000f),
                new Product(9, "Sony Laptop", 28000f),
                new Product(10, "Apple Laptop", 90000f),
                new Product(11, "HP Laptop", 25000f),
                new Product(12, "Dell Laptop", 30000f),
                new Product(13, "Lenevo Laptop", 28000f),
                new Product(14, "Sony Laptop", 28000f),
                new Product(15, "Apple Laptop", 90000f),
                new Product(16, "HP Laptop", 25000f),
                new Product(17, "Dell Laptop", 30000f),
                new Product(18, "Lenevo Laptop", 28000f),
                new Product(19, "Sony Laptop", 28000f),
                new Product(20, "Apple Laptop", 90000f),
                new Product(21, "HP Laptop", 25000f),
                new Product(22, "Dell Laptop", 30000f),
                new Product(23, "Lenevo Laptop", 28000f),
                new Product(24, "Sony Laptop", 28000f),
                new Product(25, "Apple Laptop", 90000f),
                new Product(26, "HP Laptop", 25000f),
                new Product(27, "Dell Laptop", 30000f),
                new Product(28, "Lenevo Laptop", 28000f),
                new Product(29, "Sony Laptop", 28000f),
                new Product(30, "Apple Laptop", 90000f),
                new Product(31, "HP Laptop", 25000f),
                new Product(32, "Dell Laptop", 30000),
                new Product(33, "Lenevo Laptop", 28000f),
                new Product(34, "Sony Laptop", 28000f),
                new Product(35, "Apple Laptop", 90000f),
                new Product(36, "HP Laptop", 25000f)
        );

        return list;
    }
}
