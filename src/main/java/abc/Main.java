package abc;

import abc.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        myCalculator.setFirst(7);
        myCalculator.setSecond(4);
        int a = myCalculator.getFirst();
        int b = myCalculator.getSecond();
        myCalculator.printResult(myCalculator.addition(a,b));
        myCalculator.printResult(myCalculator.subtraction(a,b));
        myCalculator.printResult(myCalculator.multiplication(a,b));
        myCalculator.printResult(myCalculator.division(a,b));
    }

}