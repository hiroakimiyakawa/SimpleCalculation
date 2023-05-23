public class Calculator {
    public static void main(String[] args) {
        double num1 = 20.0;
        double num2 = 10.0;

        System.out.println("Addition: " + Addition.add(num1, num2));
        System.out.println("Subtraction: " + Subtraction.subtract(num1, num2));
        System.out.println("Multiplication: " + Multiplication.multiply(num1, num2));
        System.out.println("Division: " + Division.divide(num1, num2));
    }
}
