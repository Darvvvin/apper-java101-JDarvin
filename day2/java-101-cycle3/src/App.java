public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Let's talk about variables!
        int age = 15;

        // Numeric whole data types: short, int, long
        System.out.println(age);

        age = age + 10;

        System.out.println(age);

        long myBalanceInGCash = 1000000000;
        long newBalance = myBalanceInGCash + age; // You can do operations, but you can't assign it to an int
        System.out.println(newBalance);

        // Decimal data types: double and float
        double price = 4.45;

        double newPrice = age + price;
        System.out.println(newPrice);

        float discount = 9.56f;
        double subtotal = newPrice + discount;
        System.out.println(subtotal);

        double num1 = 1;
        float num2 = 4000.54f;
        double v = num1 + num2; // Refactor -> Introduce Variable

        // int resultMaxValue = Integer.MAX_VALUE + Integer.MAX_VALUE;
        // System.out.println(resultMaxValue);

        // Strings
        int number1 = 1;
        char number1char = '1';
        String number1string = "1"; // Array of characters

        String myNameStr = "Jacob";
        char[] myNameArr = new char[]{'0', 'r'};

        System.out.println(myNameStr);
        System.out.println(myNameStr.substring(2,4));

        boolean isEqualName = myNameStr.equals("jacob");
        boolean isEqualNameIgnoreCase = myNameStr.equalsIgnoreCase("jacob");

        System.out.println(isEqualName + " " + isEqualNameIgnoreCase);
    }
}
