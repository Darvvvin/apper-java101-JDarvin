package map;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> cars = new HashMap<>();
        cars.put("c1", "Innovva");
        cars.put("c2", "FJ Cruiser");
        cars.put("c3", "Expander");
        cars.put("c4", "Vios");
        cars.put("c5", "Honda");
        cars.put("c6", "Tesla");
        cars.put("c7", "Tesla");

        System.out.println(cars.get("c3"));
        System.out.println(cars.size());
        System.out.println(cars.keySet());
        System.out.println(cars.containsKey("c7"));
        System.out.println(cars.containsValue("FJ Cruiser"));
        System.out.println(cars.values());
    }
}
