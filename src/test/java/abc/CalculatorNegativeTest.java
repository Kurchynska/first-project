package abc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorNegativeTest {
    private Calculator calc = new Calculator();
    public final String ADD_MESSAGE = "Wrong addition result";
    public final String MUL_MESSAGE = "Wrong multiplication result";
    public final String DES_MESSAGE = "Wrong subtraction result";

    /**
     * Division by 0
     */
    @Test(expectedExceptions = ArithmeticException.class)
    public void negativeTestFirst(){
        int a = 258;
        int b = 0;
        calc.division(a,b);
    }

    /**
     * Add two positive numbers to receive number more than max int
     */
    @Test
    public void negativeTestSecond(){
        int a = 2147483000;
        int b = 21000;
        int result = calc.addition(a,b);
        Assert.assertEquals(result, -2147463296, ADD_MESSAGE);
    }

    /**
     * Subtract two numbers to receive result less than min int
     */
    @Test
    public void negativeTestThird(){
        int a = -2147483000;
        int b = 4000;
        int result = calc.subtraction(a,b);
        Assert.assertEquals(result,2147480296, DES_MESSAGE);
    }

    /**
     * Multiply two numbers to receive result more than max int
     */
    @Test
    public void negativeTestFourth(){
        int a = 2147483000;
        int b = 200;
        int result = calc.multiplication(a,b);
        Assert.assertEquals(result, -129600, MUL_MESSAGE);
    }
}
