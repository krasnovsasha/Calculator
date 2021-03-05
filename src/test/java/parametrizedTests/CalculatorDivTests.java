package parametrizedTests;

import HomeWork5.operations.Division;
import HomeWork5.operations.OperationBase;
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
public class CalculatorDivTests {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 3, 3, 1 },
                { 10, 2, 5 },
                { -1, -1, 1 },
                { 0.15, 0.5, 0.3 },
                { 7, 2, 3.5 }
        });
    }
    private final OperationBase div;
    private final double first;
    private final double second;
    private final double expectedDiv;

    public CalculatorDivTests(double first, double second, double expectedDiv) {
        div = new Division();
        this.first = first;
        this.second = second;
        this.expectedDiv = expectedDiv;
    }

    @Test
    public void getResultOfDiv() {
        div.setNumber1(first);
        div.setNumber2(second);
        Assert.assertEquals(expectedDiv, div.getResult(), 0);
    }
}

