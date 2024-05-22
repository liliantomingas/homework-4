public class CalculatorInstance {
    public static void main(String[] args) {
        // Create first instance
        Calculator firstCalculator = new Calculator();
        System.out.println("First calculation: " + firstCalculator.calculatePercentage(2, 5) + " and " + firstCalculator.isGreater(3, 4));

        // Create second instance
        Calculator secondCalculator = new Calculator();
        System.out.println("Second calculation: " + secondCalculator.calculatePercentage(3.5, 9.99) + " and " + secondCalculator.isGreater(7.8, 5.6));
    }
}
