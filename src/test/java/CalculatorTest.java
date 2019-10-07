import org.junit.Test;

import java.net.CacheRequest;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void calcAdd(){
        Calculator calculator = new Calculator(5, 2);
        assertEquals(7, calculator.add());
    }

    @Test
    public void calcSubtract(){
        Calculator calculator = new Calculator(5, 2);
        assertEquals(3,calculator.subtract());
    }

    @Test
    public void  calcMultiply(){
        Calculator calculator = new Calculator(5, 2);
        assertEquals(10, calculator.multiply());
    }

    @Test
    public void  calcDivide(){
        Calculator calculator = new Calculator(5, 4);
        assertEquals(1.25, calculator.divide(), 0);
    }
}
