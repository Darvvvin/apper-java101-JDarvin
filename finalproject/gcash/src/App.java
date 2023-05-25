import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, User> users = new HashMap<>();

        users.put("09175861661", new User("Bob", 100));
        users.put("09175861662", new User("Marley", 100));
        users.put("09175861663", new User("Seth", 100));
        users.put("09175861664", new User("Ryan", 100));
        users.put("09175861665", new User("Fritz", 100));

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

        users.put(numberInput, new User(nameInput, 100));

        System.out.println("\n**Share a Load**");
        System.out.print("Sender mobile number: ");
        String senderNumberInput = scanner.nextLine();

        if(users.get(senderNumberInput) == null) {
            System.out.println("Sender " + senderNumberInput + " not found!");
            System.exit(0);
        }

        System.out.print("Recipient mobile number: ");
        String recipientNumberInput = scanner.nextLine();

        if(users.get(recipientNumberInput) == null) {
            System.out.println("Recipient " + recipientNumberInput + " not found!");
            System.exit(0);
        } else if (recipientNumberInput.equals(senderNumberInput)) {
            System.out.println("Sender and recipient shouldn't be the same!");
            System.exit(0);
        }

        System.out.print("\nEnter amount (Enter a valid number): ");
        double amountInput = scanner.nextDouble();
        if(users.get(senderNumberInput).getBalance() < amountInput) {
            System.out.println("Insufficient load transfer!\n");
        } else {
            users.get(senderNumberInput).setBalance(users.get(senderNumberInput).getBalance() - amountInput);
            users.get(recipientNumberInput).setBalance(users.get(recipientNumberInput).getBalance() + amountInput);
            System.out.println("Amount of " + amountInput + " was SUCCESSFULLY loaded into " + recipientNumberInput + " (" + users.get(recipientNumberInput).getName() + ")" + " from " + senderNumberInput + " (" + users.get(senderNumberInput).getName() + ")\n");
        }

        System.out.println("**Current Balances**");
        for (Map.Entry<String, User> entry : users.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getName() + " " + entry.getValue().getBalance());
        }
    }
}
