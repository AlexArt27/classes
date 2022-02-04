import org.junit.Assert;
import org.junit.Test;

public class FibanacciTest {

    @Test

    public void positiveTest1(){
        FibonacciSeq f = new FibonacciSeq();
        int actual = f.nthNumber(6);
        int expected = 8;

        Assert.assertEquals(8,expected);



    }
}
