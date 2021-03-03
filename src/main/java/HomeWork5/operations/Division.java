package HomeWork5.operations;


/**
 * @author Alexander Krasnov
 */
public class Division extends OperationBase {
    @Override
    public double getResult() {
        if (number2 == 0) {
            throw new ArithmeticException("\nDivision by zero is not valid " + number1 + " by " + number2);
        }
        return number1 / number2;
    }
}

