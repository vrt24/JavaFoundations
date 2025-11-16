package Day6;

import java.util.HashMap;

public class Product {
    public static void main(String[] args) {
        HashMap<String, Double> products = new HashMap<>();
        products.put("Milk", 3.14);
        products.put("Bread", 2.3);
        products.put("Eggs", 12.20);
        products.put("Salt", 0.79);
        products.put("Sugar", 2.30);
        for (String i : products.keySet()) {
            System.out.println(i);
        }
        for (Double i: products.values()){
            System.out.println(i);
        }
        products.put("Milk",3.2);
        for (String i:products.keySet()){
            System.out.println(i+":"+products.get(i));
        }
    }
}
