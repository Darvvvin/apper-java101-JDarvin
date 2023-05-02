public class PrimeNumber_v2 {
  public static void main(String[] args) {
    System.out.println("isPrime? " + isPrimeNumber(11));
  }

  public static boolean isPrimeNumber(int n) {
    long startTime = System.nanoTime();

    boolean isPrime = true;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        isPrime = false;
        break;
      }
    }

    long endTime = System.nanoTime();

    System.out.println("Duration: " + (endTime - startTime));

    return isPrime;
  }
}
