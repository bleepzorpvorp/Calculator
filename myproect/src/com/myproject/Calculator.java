
public class Calculator {
    double baseVal;
    public Calculator(double initialVal) {
        this.baseVal = initialVal;
    }
    public double add(double num1, double num2) {
        System.out.println("Adding the two integers..");
        return num1 + num2;
    }
    public double getBaseVal() {
        return baseVal;
    }
}
