package HomeWork5.utils;

import HomeWork5.logic.CalculatorLogic;
import HomeWork5.logic.CalculatorFactory;

/**
 * @author Alexander Krasnov
 */
public class CalculatorApp {
    public static void start(){
        CalculatorFactory calculatorFactory = new CalculatorFactory();
        CalculatorLogic calculator = new CalculatorLogic(calculatorFactory);
        calculator.calculate();
    }

}
