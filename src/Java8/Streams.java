package Java8;

import java.util.List;

public class Streams {
    public static void main(String[] args) {
        // Streams are used to process collections of objects
        // A stream is a sequence of objects that supports various methods
// which can be pipelined to produce the desired result
// Stream does not store elements
// It simply conveys elements from a source such as a data structure, an array, or an I/O channel, through a pipeline of computational operations
// Stream is functional in nature
// Operations performed on a stream does not modify it's source
// For example, filtering a Stream obtained from a collection produces a
// new Stream without the filtered elements, rather than removing elements from the source collection
// Stream is lazy and evaluates code only when required
// Stream is very beneficial for large collections
// Stream can be created through stream() method of collection interface
// Stream can be created through of() method of stream interface
// Stream can be created through generate() method of stream interface
// Stream can be created through iterate() method of stream interface
// Stream can be created through builder() method of stream interface
// Stream can be created through concat() method of stream interface
// Stream can be created through empty() method of stream interface
// Stream can be created through ofNullable() method of stream interface
// Stream can be created through range() method of stream interface
        List<Product> list = Product.getProducts70();
        // Using Stream Method
        list.stream().filter(p -> p.price > 20000).forEach(p -> System.out.println(p.name));
        // Using Parallel Stream Method
        list.parallelStream().filter(p -> p.price > 20000).forEach(p -> System.out.println(p.name));
        // Using Stream Method
        list.stream().map(p -> p.price).forEach(System.out::println);
        // using map method
        list.stream().filter(p -> p.price > 30000).map(pm -> pm.price).forEach(System.out::println);
        //using Optional class
        list.stream().filter(p -> p.price == 30000).map(pm -> pm.price).findFirst().ifPresent(System.out::println);
        // using Optional class ifPresentOrElse method
        list.stream().filter(p -> p.price == 30000).map(pm -> pm.price).findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("No such product"));
        // using Optional class orElse method
        list.stream().filter(p -> p.price == 30000).map(pm -> pm.price).findFirst().orElse(0.0f);
        // using Optional class orElseGet method
        list.stream().filter(p -> p.price == 30000).map(pm -> pm.price).findFirst().orElseGet(() -> 0.0f);
        // using Optional class orElseThrow method
        list.stream().filter(p -> p.price == 30000).map(pm -> pm.price).findFirst()
                .orElseThrow(() -> new RuntimeException("No such product"));
        //using count method
        long count = list.stream().filter(p -> p.price > 30000).count();
        System.out.println(count);
        //using min method
        Product productB = list.stream().min((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
        System.out.println(productB.price);
        //using max method
        Product productC = list.stream().max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
        System.out.println(productC.price);
        //using forEach method
        list.stream().forEach(System.out::println);
        //using toArray method
        Object[] arr = list.stream().toArray();
        for (Object obj : arr)
            System.out.println(obj.toString());
        //using method refrence
        list.stream().map(Product::getName).forEach(System.out::println);
        //using reduce method
        Product productA = list.stream().reduce((p1, p2) -> p1.price < p2.price ? p1 : p2).get();
        System.out.println(productA.price);
    }
}
