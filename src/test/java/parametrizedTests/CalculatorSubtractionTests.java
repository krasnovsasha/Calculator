package parametrizedTests;

import HomeWork5.operations.OperationBase;
import HomeWork5.operations.Subtraction;
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
public class CalculatorSubtractionTests {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0, 0 },
                { 1, 1, 0 },
                { -1, -1, 0 },
                { 0.15, 0.05, 0.1 },
                { 0.03, 0.02, 0.01 }
        });
    }
    private final OperationBase sub;
    private final double first;
    private final double second;
    private final double expectedSub;

    public CalculatorSubtractionTests(double first, double second, double expectedSub) {
        sub = new Subtraction();
        this.first = first;
        this.second = second;
        this.expectedSub = expectedSub;
    }

    @Test
    public void getResultOfSum() {
        sub.setNumber1(first);
        sub.setNumber2(second);
        Assert.assertEquals(expectedSub, sub.getResult(), 0.001);
    }
}

