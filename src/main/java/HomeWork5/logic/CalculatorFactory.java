package HomeWork5.logic;

import HomeWork5.operations.*;

/**
 * @author Alexander Krasnov
 */
public class CalculatorFactory {

    public OperationBase getResult(String operator) {
        OperationBase operation = null;
        switch (operator) {
            case "+" -> operation = new Sum();
            case "-" -> operation = new Subtraction();
            case "*" -> operation = new Multiplication();
            case "/" -> operation = new Division();
        }
        return operation;
    }
}
