import java.util.Map;
import java.util.Scanner;

interface ShareableLoadable {
    void registerUser(Map<String, User> users);

    void shareLoad(Map<String, User> users);

    void getBalance(Map<String, User> users);
}

public class Handler implements ShareableLoadable {
    @Override
    public void registerUser(Map<String, User> users) {
        Scanner scanner = new Scanner(System.in);

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
    }

    @Override
    public void shareLoad(Map<String, User> users) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n**Share a Load**");
        System.out.print("Sender mobile number: ");
        String senderNumberInput = scanner.nextLine();

        if (users.get(senderNumberInput) == null) {
            System.out.println("Sender " + senderNumberInput + " not found!");
            System.exit(0);
        }

        System.out.print("Recipient mobile number: ");
        String recipientNumberInput = scanner.nextLine();

        if (users.get(recipientNumberInput) == null) {
            System.out.println("Recipient " + recipientNumberInput + " not found!");
            System.exit(0);
        } else if (recipientNumberInput.equals(senderNumberInput)) {
            System.out.println("Sender and recipient shouldn't be the same!");
            System.exit(0);
        }

        System.out.print("\nEnter amount (Enter a valid number): ");
        double amountInput = scanner.nextDouble();
        if (users.get(senderNumberInput).getBalance() < amountInput) {
            System.out.println("Insufficient load transfer!\n");
        } else {
            users.get(senderNumberInput).setBalance(users.get(senderNumberInput).getBalance() - amountInput);
            users.get(recipientNumberInput).setBalance(users.get(recipientNumberInput).getBalance() + amountInput);
            System.out.println("Amount of " + amountInput + " was SUCCESSFULLY loaded into " + recipientNumberInput + " (" + users.get(recipientNumberInput).getName() + ")" + " from " + senderNumberInput + " (" + users.get(senderNumberInput).getName() + ")\n");
        }
    }

    @Override
    public void getBalance(Map<String, User> users) {
        System.out.println("**Current Balances**");
        for (Map.Entry<String, User> entry : users.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getName() + " " + entry.getValue().getBalance());
        }
    }
}