package smokeTests;

import HomeWork5.operations.*;
import org.junit.*;

/**
 * @author Alexander Krasnov
 */
public class OperationsTests {
    private OperationBase operation;

    @Test
    public void getResultOfSum() {
        operation = new Sum();
        operation.setNumber1(1);
        operation.setNumber2(2);
        Assert.assertEquals(3, operation.getResult(), 0);
    }

    @Test
    public void getResultOfSubtraction() {
        operation = new Subtraction();
        operation.setNumber1(1);
        operation.setNumber2(2);
        Assert.assertEquals(-1, operation.getResult(), 0);
    }

    @Test
    public void getResultOfMultiplication() {
        operation = new Multiplication();
        operation.setNumber1(1);
        operation.setNumber2(2);
        Assert.assertEquals(2, operation.getResult(), 0);
    }

    @Test
    public void getResultOfDivision() {
        operation = new Division();
        operation.setNumber1(1);
        operation.setNumber2(2);
        Assert.assertEquals(0.5, operation.getResult(), 0);
    }
}
