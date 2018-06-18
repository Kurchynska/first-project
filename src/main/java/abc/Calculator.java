package abc;

public class Calculator {
    private int first;
    private int second;
    public int addition(int first, int second){
        return first+second;
    }
    public int subtraction(int first, int second){
        return first-second;
    }
    public int multiplication(int first, int second){
        return first*second;
    }
    public float division(int first, int second){
        return (float)first/second;
    }
    public int getFirst() {
        return first;
    }
    public int getSecond() {
        return second;
    }
    public void setFirst(int first) {
        this.first = first;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void printResult(float toPrint){
        System.out.println("Result: "+toPrint);
    }
}
