package abc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorPositiveTest {

    /**
     * Add two positive numbers
     */
    @Test
    public void testFirstAddition(){
        int a = 4;
        int b = 7;

        Calculator calc = new Calculator();
        int result = calc.addition(a,b);

        Assert.assertEquals(result,11,"Addition does not work properly");
    }

    /**
     * Add two negative numbers
     */
    @Test
    public void testSecongAddition(){
        int a = -124;
        int b = -300;

        Calculator calc = new Calculator();
        int result = calc.addition(a,b);

        Assert.assertEquals(result,-424,"Addition does not work properly");

    }

    /**
     * Add negative and positive number
     */
    @Test
    public void testThirdAddition(){
        int a = 573;
        int b = -253;

        Calculator calc = new Calculator();
        int result = calc.addition(a,b);

        Assert.assertEquals(result,320,"Addition does not work properly");
    }

    /**
     * Add positive and zero
     */
    @Test
    public void testFourthAddition(){
        int a = 2222;
        int b = 0;

        Calculator calc = new Calculator();
        int result = calc.addition(a,b);

        Assert.assertEquals(result,2222,"Addition does not work properly");
    }

    /**
     * Add negative and zero
     */
    @Test
    public void testFifthAddition(){
        int a = 0;
        int b = -50278;

        Calculator calc = new Calculator();
        int result = calc.addition(a,b);

        Assert.assertEquals(result,-50278,"Addition does not work properly");
    }

    /**
     * Add two zeros
     */
    @Test
    public void testSixthAddition(){
        int a = 0;
        int b = 0;

        Calculator calc = new Calculator();
        int result = calc.addition(a,b);

        Assert.assertEquals(result,0,"Addition does not work properly");
    }

    /**
     * Add positive and negative number that equal module
     */
    @Test
    public void testSevenAddition(){
        int a = 2147483647;
        int b = -2147483647;

        Calculator calc = new Calculator();
        int result = calc.addition(a,b);

        Assert.assertEquals(result,0, "Addition does not work properly");
    }

    /**
     * Add two numbers that in total will give max int 2147483647
     */
    @Test
    public void testEightAddition(){
        int a = 2147480000;
        int b = 3647;

        Calculator calc = new Calculator();
        int result = calc.addition(a,b);

        Assert.assertEquals(result,2147483647,"Addition does not work properly" );
    }

    /**
     * Add two numbers to have in result min int -2147483648
     */
    @Test
    public void testTenthAddition(){
        int a = -2147483000;
        int b = -648;

        Calculator calc = new Calculator();
        int result = calc.addition(a,b);

        Assert.assertEquals(result,-2147483648,"Addition does not work properly");
    }

    /**
     * Subtract two positive numbers result should be positive
     */
    @Test
    public void testFirstSubtraction(){
        int a = 12;
        int b = 5;

        Calculator calc = new Calculator();
        int result = calc.subtraction(a,b);

        Assert.assertEquals(result,7,"Subtraction does not work properly");
    }

    /**
     * Subtract two positive numbers result should be negative
     */
    @Test
    public void testSecondSubtraction(){
        int a = 23;
        int b = 73;

        Calculator calc = new Calculator();
        int result = calc.subtraction(a,b);

        Assert.assertEquals(result,-50,"Subtraction does not work properly");
    }

    /**
     * Subtract two positive equal numbers
     */
    @Test
    public void testThirdSubtraction(){
        int a = 12345;
        int b = 12345;

        Calculator calc = new Calculator();
        int result = calc.subtraction(a,b);

        Assert.assertEquals(result,0,"Subtraction does not work properly");
    }

    /**
     * Subtract two negative numbers
     */
    @Test
    public void testFourthSubtraction(){
        int a = -2345;
        int b = -345;

        Calculator calc = new Calculator();
        int result = calc.subtraction(a,b);

        Assert.assertEquals(result,-2000,"Subtraction does not work properly");
    }

    /**
     * Subtract positive and negative number
     */
    @Test
    public void testFifthSubtract(){
        int a = 7890;
        int b = -110;

        Calculator calc = new Calculator();
        int result = calc.subtraction(a,b);

        Assert.assertEquals(result,8000,"Subtraction does not work properly");
    }

    /**
     * Subtract positive and zero
     */
    @Test
    public void testSixthSubtract(){
        int a = 100100;
        int b = 0;

        Calculator calc = new Calculator();
        int result = calc.subtraction(a,b);

        Assert.assertEquals(result,100100,"Subtraction does not work properly");
    }

    /**
     * Subtract negative and zero
     */
    @Test
    public void testSeventhSubtract(){
        int a = -555;
        int b = 0;

        Calculator calc = new Calculator();
        int result = calc.subtraction(a,b);

        Assert.assertEquals(result,-555,"Subtraction does not work properly");
    }

    /**
     * Subtract two zeros
     */
    @Test
    public void testEighthSubtract(){
        int a = 0;
        int b = 0;

        Calculator calc = new Calculator();
        int result = calc.subtraction(a,b);

        Assert.assertEquals(result,0,"Subtraction does not work properly");
    }

    /**
     * Subtract two positive numbers that are equal
     */
    @Test
    public void testNineSubtract(){
        int a = 2147483647;
        int b = 2147483647;

        Calculator calc = new Calculator();
        int result = calc.subtraction(a,b);

        Assert.assertEquals(result,0,"Subtraction does not work properly");
    }

    /**
     * Subtract two numbers to have in result max int 2147483647
     */
    @Test
    public void testTenthSubtract(){
        int a = 2147480000;
        int b = -3647;

        Calculator calc = new Calculator();
        int result = calc.subtraction(a,b);

        Assert.assertEquals(result,2147483647,"Subtraction does not work properly");
    }

    /**
     * Subtract two numbers to have in result min int -2147483648
     */
    @Test
    public void testEleventhSubtract(){
        int a = -2147400000;
        int b = 83648;

        Calculator calc = new Calculator();
        int result = calc.subtraction(a,b);

        Assert.assertEquals(result,-2147483648,"Subtraction does not work properly");
    }
}
