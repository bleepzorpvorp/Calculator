public class ScientificCalculator extends Calculator {
    public ScientificCalculator(double initialVal) {
        super(initialVal);
    } 
    public double basePower(double exponent) {
        System.out.println("Using your base integer to a power..");
        return Math.pow(this.baseVal, exponent);
    }
}