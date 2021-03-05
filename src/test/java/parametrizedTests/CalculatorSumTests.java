package parametrizedTests;

import HomeWork5.operations.OperationBase;
import HomeWork5.operations.Sum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Alexander Krasnov
 */
@RunWith (Parameterized.class)
public class CalculatorSumTests {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0, 0 },
                { 1, 1, 2 },
                { -1, -1, -2 },
                { 0.5, 0.5, 1 },
                { 0.01, 0.02, 0.03 }
        });
    }
    private final OperationBase sum;
    private final double first;
    private final double second;
    private final double expectedSum;

    public CalculatorSumTests(double first, double second, double expectedSum) {
        sum = new Sum();
        this.first = first;
        this.second = second;
        this.expectedSum = expectedSum;
    }

    @Test
    public void getResultOfSum() {
        sum.setNumber1(first);
        sum.setNumber2(second);
        Assert.assertEquals(expectedSum, sum.getResult(), 0);
    }
}
