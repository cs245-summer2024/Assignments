
import java.util.*;

/** Simple Arithmetic Class.
 * @Modified from Josh Hug
 * */
public class Arithmetic {

    /** Computes product of two ints.
     * @param a Value 1
     * @param b Value 2
     * @return Product of a and b
     * */
    public static int product(int a, int b) {
        return a * b;
    }

    /** Computes sum of two ints (incorrectly).
     * @param a Value 1
     * @param b Value 2
     * @return Sum of a and b
     * */
    public static int sum(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number with no decimals");

        int num1 = scanner.nextInt();  // Read user input

        System.out.println("Enter another number with no decimals");
        int num2 = scanner.nextInt();

        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product(num1, num2));
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum(num1, num2));
    }
}
