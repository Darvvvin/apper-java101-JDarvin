import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Shareable shareable = new Shareable();
        Map<String, User> users = new HashMap<>();

        users.put("09175861661", new User("Bob", 100));
        users.put("09175861662", new User("Marley", 100));
        users.put("09175861663", new User("Seth", 100));
        users.put("09175861664", new User("Ryan", 100));
        users.put("09175861665", new User("Fritz", 100));

        shareable.registerUser(users);
        shareable.shareLoad(users);
        shareable.getBalance(users);
    }
}