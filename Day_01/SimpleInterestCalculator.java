package Day_01;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        double principal = 900000.0;
        double rate = 5.0;
        double time = 2.0;
        double simpleInterest = (principal * rate * time) / 100.0;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
