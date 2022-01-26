package DummyCode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator c;

    @Before
    public void verifySetUp(){
        c = new Calculator();
    }

    @Test
    public  void verifyPositiveEqualNumber(){
        double actResult = c.div(10,10);
        double expResult = 2;

//        Assert.assertEquals(actResult,expResult,0);
        Assert.assertTrue("Expected "+expResult +" : Actual "+actResult,actResult == expResult );
    }
}
