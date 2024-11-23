package kalra.himanshu.demo;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//        Lock l = new ReentrantReadWriteLock.ReadLock();
        // Sample data
//        List<Category> categories = Arrays.asList(new Category("Electronics"), new Category("Books"), new Category("Clothing"));
//
//        List<Product> products = Arrays.asList(new Product(name: "Laptop", cat_id: "1"), new Product("Smartphone", "1"), new Product("E-reader", "2"), new Product("Novel", "2"), new Product("T-shirt", "3"), new Product("Jeans", "3"));
        List<String> sales = new ArrayList<>();
//        List<Sale> sales = Arrays.asList(new Sale("1", "Laptop", 1500),
//                new Sale(cat_id: "1", p_name: "Smartphone", amount: 500),
//                new Sale("2", "E-reader", 200),
//                new Sale("2", "Novel", 150),
//                new Sale("3", "T-shirt", 300),
//                new Sale("3", "Jeans", 400),
//                new Sale("1", "Laptop", 700),
//                new Sale("2", "E-reader", 100),
//                new Sale("2", "Novel", 600),
//                new Sale("3", "T-shirt", 500));
//


// top 3 products by sale in each category...

//    Category: {
//        List<product>
//
//    }
//
//    Product: {
//        cat_id:
//        name:
//    }
//
//    Sale: {
//        cat_id:
//        p_name:
//        amount:
//    }

//        Map<String, Long> productToTotalSaleMap = sales.stream().collect(Collectors.groupingBy(Sale::getProductName), Collectors.summingLong(Sale::getAmount));
//        Map<String, product> productNameToProductMap = product.stream().collect(Collectors.groupingBy(Product::getName), Function.identity());
//
//        Map<Product, Long> map= new HashMap();
//
//        productToTotalSaleMap.entrySet().stream().forEach(e-> {
//            map.put(productNameToProductMap.get(e.getKey()), e.getValue());
//        });
//
//        PriorityQueue<Map.Entry<Product, Long>> queue = new PriorityQueue<>(Comparator.comparing(Map.Entry::getValue));
//
//        map.entrySet().stream().forEach(e-> queue.add(e));
//
//        for(int i =0; i<3; ++i) {
//            System.out.println(queue.poll());
//        }

    }
}
