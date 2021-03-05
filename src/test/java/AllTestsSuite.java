import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import parametrizedTests.CalculatorDivTests;
import parametrizedTests.CalculatorSumTests;
import smokeTests.OperationsTests;

/**
 * @author Alexander Krasnov
 */
@RunWith (Suite.class)
@Suite.SuiteClasses({OperationsTests.class,CalculatorSumTests.class, CalculatorDivTests.class} )
public final class AllTestsSuite {

}
