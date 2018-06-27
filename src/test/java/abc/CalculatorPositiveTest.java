package abc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorPositiveTest {
    public final String ADD_TEXT = "Addition does not work properly";
    public final String SUBTRACT_TEXT = "Subtraction does not work properly";
    public final String MULTIPLY_TEXT = "Multiplication does not work properly";
    public final String DIVIDE_TEXT  = "Division does not work properly";
    private Calculator calc = new Calculator();

    /**
     * Add two positive numbers
     */
    @Test
    public void testFirstAddition(){
        int a = 4;
        int b = 7;
        int result = calc.addition(a,b);
        Assert.assertEquals(result,11,ADD_TEXT );
    }

    /**
     * Add two negative numbers
     */
    @Test
    public void testSecongAddition(){
        int a = -124;
        int b = -300;
        int result = calc.addition(a,b);
        Assert.assertEquals(result,-424,ADD_TEXT );
    }

    /**
     * Add negative and positive number
     */
    @Test
    public void testThirdAddition(){
        int a = 573;
        int b = -253;
        int result = calc.addition(a,b);
        Assert.assertEquals(result,320,ADD_TEXT );
    }

    /**
     * Add positive and zero
     */
    @Test
    public void testFourthAddition(){
        int a = 2222;
        int b = 0;
        int result = calc.addition(a,b);
        Assert.assertEquals(result,2222,ADD_TEXT);
    }

    /**
     * Add negative and zero
     */
    @Test
    public void testFifthAddition(){
        int a = 0;
        int b = -50278;
        int result = calc.addition(a,b);
        Assert.assertEquals(result,-50278,ADD_TEXT);
    }

    /**
     * Add two zeros
     */
    @Test
    public void testSixthAddition(){
        int a = 0;
        int b = 0;
        int result = calc.addition(a,b);
        Assert.assertEquals(result,0,ADD_TEXT);
    }

    /**
     * Add positive and negative number that equal module
     */
    @Test
    public void testSevenAddition(){
        int a = 2147483647;
        int b = -2147483647;
        int result = calc.addition(a,b);
        Assert.assertEquals(result,0, ADD_TEXT);
    }

    /**
     * Add two numbers that in total will give max int 2147483647
     */
    @Test
    public void testEightAddition(){
        int a = 2147480000;
        int b = 3647;
        int result = calc.addition(a,b);
        Assert.assertEquals(result,2147483647,ADD_TEXT);
    }

    /**
     * Add two numbers to have in result min int -2147483648
     */
    @Test
    public void testTenthAddition(){
        int a = -2147483000;
        int b = -648;
        int result = calc.addition(a,b);
        Assert.assertEquals(result,-2147483648,ADD_TEXT);
    }

    /**
     * Subtract two positive numbers result should be positive
     */
    @Test
    public void testFirstSubtraction(){
        int a = 12;
        int b = 5;
        int result = calc.subtraction(a,b);
        Assert.assertEquals(result,7,SUBTRACT_TEXT);
    }

    /**
     * Subtract two positive numbers result should be negative
     */
    @Test
    public void testSecondSubtraction(){
        int a = 23;
        int b = 73;
        int result = calc.subtraction(a,b);
        Assert.assertEquals(result,-50,SUBTRACT_TEXT);
    }

    /**
     * Subtract two positive equal numbers
     */
    @Test
    public void testThirdSubtraction(){
        int a = 12345;
        int b = 12345;
        int result = calc.subtraction(a,b);
        Assert.assertEquals(result,0,SUBTRACT_TEXT);
    }

    /**
     * Subtract two negative numbers
     */
    @Test
    public void testFourthSubtraction(){
        int a = -2345;
        int b = -345;
        int result = calc.subtraction(a,b);
        Assert.assertEquals(result,-2000,SUBTRACT_TEXT);
    }

    /**
     * Subtract positive and negative number
     */
    @Test
    public void testFifthSubtract(){
        int a = 7890;
        int b = -110;
        int result = calc.subtraction(a,b);
        Assert.assertEquals(result,8000,SUBTRACT_TEXT);
    }

    /**
     * Subtract positive and zero
     */
    @Test
    public void testSixthSubtract(){
        int a = 100100;
        int b = 0;
        int result = calc.subtraction(a,b);
        Assert.assertEquals(result,100100,SUBTRACT_TEXT);
    }

    /**
     * Subtract negative and zero
     */
    @Test
    public void testSeventhSubtract(){
        int a = -555;
        int b = 0;
        int result = calc.subtraction(a,b);
        Assert.assertEquals(result,-555,SUBTRACT_TEXT);
    }

    /**
     * Subtract two zeros
     */
    @Test
    public void testEighthSubtract(){
        int a = 0;
        int b = 0;
        int result = calc.subtraction(a,b);
        Assert.assertEquals(result,0,SUBTRACT_TEXT);
    }

    /**
     * Subtract two positive numbers that are equal
     */
    @Test
    public void testNineSubtract(){
        int a = 2147483647;
        int b = 2147483647;
        int result = calc.subtraction(a,b);
        Assert.assertEquals(result,0,SUBTRACT_TEXT);
    }

    /**
     * Subtract two numbers to have in result max int 2147483647
     */
    @Test
    public void testTenthSubtract(){
        int a = 2147480000;
        int b = -3647;
        int result = calc.subtraction(a,b);
        Assert.assertEquals(result,2147483647,SUBTRACT_TEXT);
    }

    /**
     * Subtract two numbers to have in result min int -2147483648
     */
    @Test
    public void testEleventhSubtract(){
        int a = -2147400000;
        int b = 83648;
        int result = calc.subtraction(a,b);
        Assert.assertEquals(result,-2147483648,SUBTRACT_TEXT);
    }

    /**
     * Multiply two positive numbers
     */
    @Test
    public void testFirstMultiply(){
        int a = 10;
        int b = 25;
        int result = calc.multiplication(a,b);
        Assert.assertEquals(result,250,MULTIPLY_TEXT);
    }

    /**
     * Multiply two negative numbers
     */
    @Test
    public void testSecondMultiply(){
        int a = -20;
        int b = -45;
        int result = calc.multiplication(a,b);
        Assert.assertEquals(result,900,MULTIPLY_TEXT);
    }

    /**
     * Multiply positive and negative number
     */
    @Test
    public void testThirdMultiply(){
        int a = 100;
        int b = -35;
        int result = calc.multiplication(a,b);
        Assert.assertEquals(result,-3500,MULTIPLY_TEXT);
    }

    /**
     * Multiply positive and zero
     */
    @Test
    public void testFourthMultiply(){
        int a = 1002200;
        int b = 0;
        int result = calc.multiplication(a,b);
        Assert.assertEquals(result,0,MULTIPLY_TEXT);
    }

    /**
     * Multiply negative and zero
     */
    @Test
    public void testFifthMultiply(){
        int a = -9902200;
        int b = 0;
        int result = calc.multiplication(a,b);
        Assert.assertEquals(result,0,MULTIPLY_TEXT);
    }

    /**
     * Multiply two zeros
     */
    @Test
    public void testSixthMultiply(){
        int a = 0;
        int b = 0;
        int result = calc.multiplication(a,b);
        Assert.assertEquals(result,0,MULTIPLY_TEXT);
    }

    /**
     * Multiply max int result should be max int 2147483647
     */
    @Test
    public void testSeventhMultiply(){
        int a = 2147483647;
        int b = 1;
        int result = calc.multiplication(a,b);
        Assert.assertEquals(result,2147483647,MULTIPLY_TEXT);
    }

    /**
     * Multiply max int result should be max int 2147483647
     */
    @Test
    public void testEighthMultiply(){
        int a = 2147483647;
        int b = 1;
        int result = calc.multiplication(a,b);
        Assert.assertEquals(result,2147483647,MULTIPLY_TEXT);
    }

    /**
     * Multiply min int result should be min int -2147483648
     */
    @Test
    public void testNinthMultiply(){
        int a = -2147483648;
        int b = 1;
        int result = calc.multiplication(a,b);
        Assert.assertEquals(result,-2147483648,MULTIPLY_TEXT);
    }

    /**
     * Divide two positive numbers
     */
    @Test
    public void testFirstDivision(){
        int a = 12;
        int b = 5;
        float result = calc.division(a,b);
        Assert.assertEquals(result,2.4, 0.0001, DIVIDE_TEXT);
    }

    /**
     * Divide two negative numers
     */
    @Test
    public void testSecondDivision(){
        int a = -33;
        int b = -20;
        float result = calc.division(a,b);
        Assert.assertEquals(result,1.65, 0.0001, DIVIDE_TEXT);
    }

    /**
     * Divide positive and negative number
     */
    @Test
    public void testThirdDivision(){
        int a = 5;
        int b = -25;
        float result = calc.division(a,b);
        Assert.assertEquals(result,-0.2, 0.0001, DIVIDE_TEXT);

    }

    /**
     * Divide zero and positive number
     */
    @Test
    public void testFourthDivision(){
        int a = 0;
        int b = 213456;
        float result = calc.division(a,b);
        Assert.assertEquals(result,0, 0.0001, DIVIDE_TEXT);
    }

    /**
     * Divide zero and negative number
     */
    @Test
    public void testFifthDivision(){
        int a = 0;
        int b = -7381728;
        float result = calc.division(a,b);
        Assert.assertEquals(result,0, 0.0001, DIVIDE_TEXT);
    }

    /**
     * Divide max int 2147483647
     */
    @Test
    public void testSixthDivision(){
        int a = 2147483647;
        int b = 1000;
        float result = calc.division(a,b);
        Assert.assertEquals(result,2147483.75, 0.0001, DIVIDE_TEXT);
    }

    /**
     * Divide min int -2147483648 and max int
     */
    @Test
    public void testSevenDivision(){
        int a = -2147483648;
        int b = 2147483647;
        float result = calc.division(a,b);
        Assert.assertEquals(result,-1, 0.0001, DIVIDE_TEXT);
    }

}
