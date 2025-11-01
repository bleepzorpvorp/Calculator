import java.util.Scanner; // user input
// Main class
public class Main {
    public static void main(String[] args) {
        //scanner takes in input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator!");
        System.out.print("Enter base value:");
        //object creation
        double baseValInput = scanner.nextDouble();
        ScientificCalculator SciCalc = new ScientificCalculator(baseValInput);
        //inherited method
        double Base = SciCalc.getBaseVal();
        System.out.println("Initial Base: " + Base);
        //basic operation
        System.out.print("Enter the first number for addition: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number for addition: ");
        double num2 = scanner.nextDouble();
        double sum = SciCalc.add(num1, num2);
        //returns sum
        System.out.println("Sum: " + sum);
         //Harder math
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        double powerResult = SciCalc.basePower(exponent);
        // return
        System.out.println("Base Value " + Base + " raised to the power of " + exponent + " is: " + powerResult); 
        scanner.close();
        System.out.println("Your Calculator has died. Oh well, you tried! Goodbye.");
    }
}