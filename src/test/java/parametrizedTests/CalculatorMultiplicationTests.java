package parametrizedTests;

import HomeWork5.operations.OperationBase;
import HomeWork5.operations.Multiplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Alexander Krasnov
 */
@RunWith (Parameterized.class)
public class CalculatorMultiplicationTests {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0, 0},
                {1, 1, 1},
                {-1, -1, 1},
                {0.5, 0.5, 0.25},
                {0.01, 0.02, 0.0002}
        });
    }

    private final OperationBase mul;
    private final double first;
    private final double second;
    private final double expectedMul;

    public CalculatorMultiplicationTests(double first, double second, double expectedMul) {
        mul = new Multiplication();
        this.first = first;
        this.second = second;
        this.expectedMul = expectedMul;
    }

    @Test
    public void getResultOfMul() {
        mul.setNumber1(first);
        mul.setNumber2(second);
        Assert.assertEquals(expectedMul, mul.getResult(), 0);
    }
}
