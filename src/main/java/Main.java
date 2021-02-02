import java.util.Scanner;

/**
 * @author Alexander Krasnov
 * @see #calculate() which has been realized with switch-case construction
 */

public class Main {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        double result;
        System.out.println("Insert first number: ");
        double number1 = scanner.nextDouble();
        System.out.println("Insert second number: ");
        double number2 = scanner.nextDouble();
        System.out.println("For calculate sum of " + number1 + " and " + number2 + " insert +");
        System.out.println("For calculate subtraction of " + number1 + " and " + number2 + " insert -");
        System.out.println("For calculate division of " + number1 + " and " + number2 + " insert /");
        System.out.println("For calculate multiplication of " + number1 + " and " + number2 + " insert *");
        String choice = scanner.next();
        switch (choice) {
            case ("+"):
                result = number1 + number2;
                System.out.printf("Sum " + number1 + " + " + number2 + " is %.4f", result);
                scanner.close();
                break;
            case ("-"):
                result = number1 - number2;
                System.out.printf("Result of subtraction " + number1 + " and " + number2 + " is %.4f", result);
                scanner.close();
                break;
            case ("*"):
                result = number1 * number2;
                System.out.printf("Result of multiplication " + number1 + " and " + number2 + " is %.4f", result);
                scanner.close();
                break;
            case ("/"):
                result = number1 / number2;
                System.out.printf("Result of division " + number1 + " and " + number2 + " is %.4f", result);
                scanner.close();
                break;
        }
    }
}


