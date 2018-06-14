public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        myCalculator.setFirst(7);
        myCalculator.setSecond(4);
        myCalculator.printResult(myCalculator.addition(myCalculator.getFirst(),myCalculator.getSecond()));
        myCalculator.printResult(myCalculator.subtraction(myCalculator.getFirst(),myCalculator.getSecond()));
        myCalculator.printResult(myCalculator.multiplication(myCalculator.getFirst(),myCalculator.getSecond()));
        myCalculator.printResult(myCalculator.division(myCalculator.getFirst(),myCalculator.getSecond()));
    }

}
