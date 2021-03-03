package HomeWork5.data;

import java.util.Scanner;

/**
 * @author Alexander Krasnov
 */
public class DataInputHandler {
    private Scanner scanner;
    private double number1;
    private double number2;
    private String operand;

    public Scanner getScanner() {
        return scanner;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public double setNumber2() {
        return scanner.nextDouble();
    }

    public String getOperand() {
        return operand;
    }


    public void inputData() {
            scanner = new Scanner(System.in);
            System.out.println("Insert two numbers and operation (+, -, /, *)");
            number1 = Double.parseDouble(scanner.nextLine());
            number2 = Double.parseDouble(scanner.nextLine());
            operand = scanner.nextLine();
            while (!operand.equals("+") & !operand.equals("-") & !operand.equals("/") & !operand.equals("*")) {
                System.out.printf("Operation %s is not valid. Please insert +, -, /, *\n",operand);
                operand = scanner.next();
            }
    }
}
