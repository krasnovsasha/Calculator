import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Alexander Krasnov
 * @see #choiceTheMethod() which has been realized with switch-case construction Java 14 style
 * @see #calculate() which has been realized with switch-case construction Java 14 style
 * @see #maxWordLength() which has been realized with ArrayList
 */

public class Main {
    public static void main(String[] args) {
        choiceTheMethod();
    }

    public static void choiceTheMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To use calculator insert 1\nFor finding word with max length insert 2");
        String choice = scanner.next();
        switch (choice) {
            case ("1") -> {
                calculate();
                scanner.close();
            }
            case ("2") -> {
                maxWordLength();
                scanner.close();
            }
        }
    }

    private static void calculate() {
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
            case ("+") -> {
                result = number1 + number2;
                System.out.printf("Sum " + number1 + " + " + number2 + " is %.4f", result);
                scanner.close();
            }
            case ("-") -> {
                result = number1 - number2;
                System.out.printf("Result of subtraction " + number1 + " and " + number2 + " is %.4f", result);
                scanner.close();
            }
            case ("*") -> {
                result = number1 * number2;
                System.out.printf("Result of multiplication " + number1 + " and " + number2 + " is %.4f", result);
                scanner.close();
            }
            case ("/") -> {
                result = number1 / number2;
                System.out.printf("Result of division " + number1 + " and " + number2 + " is %.4f", result);
                scanner.close();
            }
        }
    }

    private static void maxWordLength() {
        Scanner scanner = new Scanner(System.in);
        String maxLengthWord = "";
        int length = 0;
        System.out.println("Insert length of array");
        int arrayLength = scanner.nextInt();
        ArrayList<String> words = new ArrayList<>(arrayLength);
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Insert your word");
            words.add(scanner.next());
        }
        for (String s : words) {
            if (s.length() > length) {
                maxLengthWord = s;
                length = s.length();
            }
        }
        System.out.printf("Max length in array has word '%s' (%d) symbols", maxLengthWord, length);
    }
}


