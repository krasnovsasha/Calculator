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


    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public String getOperand() {
        return operand;
    }

    public void inputData() {
        scanner = new Scanner(System.in);
        System.out.println("Insert two numbers and operation (+, -, /, *)");
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();
        operand = scanner.next();
        scanner.close();
    }
}
