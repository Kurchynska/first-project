package abc;
import org.testng.annotations.Test;

public class CalculatorNegativeTest {

    /**
     * Division by 0
     */
    @Test(expectedExceptions = ArithmeticException.class)
    public void negativeTestFirst(){
        int a = 258;
        int b = 0;

        Calculator calc = new Calculator();
        calc.division(a,b);
    }

    /**
     * Add two positive numbers to receive number more than max int
     */
    @Test(expectedExceptions = ArithmeticException.class)
    public void negativeTestSecond(){
        int a = 2147483000;
        int b = 21000;

        Calculator calc = new Calculator();
        int result = calc.addition(a,b);

       if(result<a){
            throw new  ArithmeticException("Wrong addition result");
        }
    }

    /**
     * Subtract two numbers to receive result less than min int
     */
    @Test(expectedExceptions = ArithmeticException.class)
    public void negativeTestThird(){
        int a = -2147483000;
        int b = 4000;

        Calculator calc = new Calculator();
        int result = calc.subtraction(a,b);

        if(result>a){
            throw new ArithmeticException("Wrong subtraction result");
        }
    }

    /**
     * Multiply two numbers to receive result more than max int
     */
    @Test(expectedExceptions = ArithmeticException.class)
    public void negativeTestFourth(){
        int a = 2147483000;
        int b = 200;

        Calculator calc = new Calculator();
        int result = calc.multiplication(a,b);

        if(result<a){
            throw new ArithmeticException("Wrong multiplication result");
        }
    }
}
