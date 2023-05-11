import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> users = new HashMap<>();

        users.put("09175861661", "Bob");
        users.put("09175861662", "Marley");
        users.put("09175861663", "Seth");
        users.put("09175861664", "Ryan");
        users.put("09175861665", "Fritz");

        System.out.println("**Register an Account**");
        System.out.print("Number: ");
        String numberInput = scanner.nextLine();

        if (users.get(numberInput) != null) {
            System.out.println("Number " + numberInput + " already registered!");
            System.exit(0);
        }

        System.out.print("Name: ");
        String nameInput = scanner.nextLine();

        if (nameInput.isBlank()) {
            System.out.println("Name must not be empty!");
            System.exit(0);
        }

        users.put(numberInput, nameInput);

        System.out.println("\n**Share a Load**");
    }
}
