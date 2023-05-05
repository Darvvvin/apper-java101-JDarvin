public class DataTypes {

    // Zero value
    static int age; // 0
    static double salary; // 0.0
    static boolean isHappy; // False
    static char favoriteLetter;
    static float weight; // 0.0
    static long distance;

    // Wrapper classes
    static Integer wrapperAge;
    static Boolean wrapperIsHappy;

    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(salary);
        System.out.println(isHappy);
        System.out.println(favoriteLetter);
        System.out.println(weight);
        System.out.println(distance);

        System.out.println(age + " " + wrapperAge);
        System.out.println(isHappy + " " + wrapperIsHappy);

        System.out.println(age + 10);
        // System.out.println(wrapperAge + age);

        // Only objects are allowed to hold a null value

        // Wrappers are immutable (but create new objects when modified)

        // Integer theAge = 10;
        // System.out.println(theAge);

        // theAge = theAge + 89;

        System.out.println("+++++");

        // Pass by value
        Integer theAge = 100;
        System.out.println(theAge); // Looks into a different memory space from the following method
        displayAgeInAFancyWay(theAge);

        System.out.println("Value of theAge after calling fancy method: " + theAge);

        System.out.println("+++++");

        // Pass by reference
        Integer[] ages = new Integer[]{100};
        System.out.println(ages[0]);
        displayAgeInAFancyWay(ages);

        System.out.println("Value of theAge after calling fancy method: " + ages[0]);

        // Primitive to wrapper
        int numUsers = 101;
        Integer numberOfUsers = numUsers;

        System.out.println(numberOfUsers.intValue());

        System.out.println("+++++");
        int a = 9;
        int b = 10;
        int c = 78;

        System.out.println(c % 4);
        System.out.println((a + b) * c % 4);

        System.out.println(c++ + " " + ++a); // Prefix, changes before line, postfix changes after
        System.out.println(c);
    }

    static void displayAgeInAFancyWay(Integer age) {
        System.out.println("Fancy! " + age);
        age = age + 100;
    }

    static void displayAgeInAFancyWay(Integer[] age) {
        System.out.println("Fancy! " + age[0]);
        age[0] = age[0] + 100;
    }
}
