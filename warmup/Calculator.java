package warmup;

/*public class Main {

    public static void main(String[] args) {
        // My code
        int sum = 0;

        for (int i = 3; i < 1000; i = i+3) {
            sum = sum + i;
        }

        for (int i = 5; i < 1000, i = i + 5) {
            sum = sum + i;
        }

        for (int i = 15; i < 1000; i = i + 15) {
            sum = sum - i;
        }

        System.out.println("The sum of all multiples of 3 and 5 under 1000 is: " + sum)




    }
}
*/
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Simple Calculator");

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = input.next().charAt(0);

        double result = 0;

        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        } else if (op == '*') {
            result = num1 * num2;
        } else if (op == '/') {
            result = num1 / num2;
        } else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println("Result: " + result);
    }
}
