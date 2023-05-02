import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter number to check if prime: ");

        int nInput = myScanner.nextInt();
        System.out.println("Is your number a prime? " + checkIfPrime(nInput));

        myScanner.close();
    }

    public static boolean checkIfPrime(int n) {
        boolean isPrime = true;
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}