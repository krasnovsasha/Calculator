package HomeWork5.logic;

import HomeWork5.data.DataInputHandler;
import HomeWork5.operations.OperationBase;


/**
 * @author Alexander Krasnov
 */
public class CalculatorLogic {
    private final CalculatorFactory calculatorFactory;

    public CalculatorLogic(CalculatorFactory calculatorFactory) {
        this.calculatorFactory = calculatorFactory;
    }

    public void calculate() {
        OperationBase operationBase;
        DataInputHandler dataInputHandler = new DataInputHandler();
        dataInputHandler.inputData();
        operationBase = calculatorFactory.getResult(dataInputHandler.getOperand());
        operationBase.setNumber1(dataInputHandler.getNumber1());
        operationBase.setNumber2(dataInputHandler.getNumber2());
        System.out.print("Result is: ");
        System.out.println(operationBase.getResult());
    }
}
