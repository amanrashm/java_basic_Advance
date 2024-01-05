package Java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class Lambda_Expression {
        // Lambda Expression
        // Lambda Expression is a new and important feature of Java which was included in Java SE 8.
        // It provides a clear and concise way to represent one method interface using an expression.
        // It is very useful in collection library in which it helps to iterate, filter and extract data.
        // Syntax:
        // (argument-list) -> {body}
        // Java Lambda Expression Example: No Parameter
        // Lambda expression provides implementation of functional interface.
        // An interface which has only one abstract method is called functional interface.
        // Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.
        // Java Lambda Expression Example: Single Parameter
        // Java Lambda Expression Example: Multiple Parameters
        // Java Lambda Expression Example: Foreach Loop
        // Java Lambda Expression Example: Filter Collection Data
        // Java Lambda Expression Example: Comparator
        // Java Lambda Expression Example: Runnable

                // No Parameter
                // Lambda expression provides implementation of functional interface.
                // An interface which has only one abstract method is called functional interface.
                // Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.
                // Java Lambda Expression Example: No Parameter
                // () -> System.out.println("Hello Lambda Expressions");
                // Single Parameter
                // Java Lambda Expression Example: Single Parameter
                // (p) -> System.out.println(p);
                // Multiple Parameters
                // Java Lambda Expression Example: Multiple Parameters
                // (p1, p2) -> System.out.println(p1 + p2);
                // Foreach Loop
                // Java Lambda Expression Example: Foreach Loop
                // List<String> list = new ArrayList<String>();
                // list.add("ankit");
                // list.add("mayank");
                // list.add("irfan");
                // list.add("jai");
                // list.forEach(
                //         (n) -> System.out.println(n)
                // );
                // Filter Collection Data
                // Java Lambda Expression Example: Filter Collection Data
                // List<Product> list = new ArrayList<Product>();
                // list.add(new Product(1, "Samsung A5", 17000f));
                // list.add(new Product(3, "Iphone 6S", 65000f));
                // list.add(new Product(2, "Sony Xperia", 25000f));
                // list.add(new Product(4, "Nokia Lumia", 15000f));
                // list.add(new Product(5, "Redmi4 ", 26000f));
                // list.add(new Product(6, "Lenevo Vibe", 19000f));
                // List<Float> productPriceList = new ArrayList<Float>();
                // for (Product product : list) {
                //         // filtering data of list
                //         if (product.price < 20000) {
                //                 productPriceList.add(product.price); // adding price to a productPriceList
                //         }
                // }
                // System.out.println(productPriceList); // displaying data
                // List<Float> productPriceList2 = list.stream()
                //         .filter(p -> p.price > 20000)// filtering data
                //         .map(p -> p.price)        // fetching price
                //         .collect(Collectors.toList()); // collecting
                public static void main(String[] args) {
        List nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);

        for (Object num : nums)
            if(((int) num & 2) == 0)
                out.println(num);
    }
}
