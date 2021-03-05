import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import parametrizedTests.CalculatorDivTests;
import parametrizedTests.CalculatorMultiplicationTests;
import parametrizedTests.CalculatorSubtractionTests;
import parametrizedTests.CalculatorSumTests;
import smokeTests.OperationsTests;

/**
 * @author Alexander Krasnov
 */
@RunWith (Suite.class)
@Suite.SuiteClasses({
        OperationsTests.class,
        CalculatorSumTests.class,
        CalculatorSubtractionTests.class,
        CalculatorMultiplicationTests.class,
        CalculatorDivTests.class
} )
public final class AllTestsSuite {

}
