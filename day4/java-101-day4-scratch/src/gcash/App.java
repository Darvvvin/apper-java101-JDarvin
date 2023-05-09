package gcash;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // <Key, Value>
        Map<String, String> users = new HashMap<>();
        users.put("09176565612", "Jacob");
        users.put("09176565613", "Max");
        users.put("09176565614", "Rox");

        System.out.println(users.get("09176565612"));

        for (Map.Entry<String, String> entry : users.entrySet()) {
            if(entry.getValue().equals("Jacob")) {
                System.out.println(entry.getKey());

                break;
            }
        }
    }
}
