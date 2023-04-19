import java.util.Random;
import java.util.Scanner;

class Activity1 {

    public static void main(String[] args) {
        System.out.println("Welcome to FlamesHope!");

        Scanner myScanner = new Scanner(System.in);

        // read https://www.w3schools.com/java/java_ref_string.asp
        // read https://www.w3schools.com/java/java_conditions.asp
        
        // allow user to enter his/her name
        System.out.print("What's your name: ");
        String name = myScanner.nextLine();

        // ITEM#1: Check if name is not empty. If empty, display "Your name is required." then the program should terminate
        if(name.isEmpty()) {
            System.out.println("Your name is required.");
            System.exit(0);
        }

        // allow user to enter his/her crush's name
        System.out.print("What's your cursh name: ");
        String crushName = myScanner.nextLine();

        // ITEM#2: Check if crushName is not empty. If empty, display "Your crushName is required."  then the program should terminate
        if(crushName.isEmpty()) {
            System.out.println("Your crushName is required.");
            System.exit(0);
        }

        myScanner.close();

        int nameLength = name.length(); // ITEM#3 get length of name
        int crushNameLength = crushName.length(); // ITEM#4 get length of crushName
        int result = result(nameLength, crushNameLength);

        // display result.
        System.out.println("Your compatibility result: " + result);

        // ITEM#5 if result is less than 50, display "SAD :( ", else display name and crush name with <3 E.g "Orvyl and JY is <3"
        if(result < 50) {
            System.out.println("SAD :(");
        } else {
            System.out.println(name + " and " + crushName + " is <3");
        }
    }

    static int result(int nameLength, int crushNameLength) {
        int total = nameLength + crushNameLength;
        Random random = new Random();
        return random.nextInt(total - 1) + 1;
    }

}