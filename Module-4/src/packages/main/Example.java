package packages.main;

import packages.math.ArithmeticOperation;

public class Example {
    public static void main(String[] args) {
        int sub = ArithmeticOperation.subtract(10, 5);
        System.out.println("Subtraction is : " + sub);
        int multiply = ArithmeticOperation.multiply(10, 5);
        System.out.println("Multiplication is : " + multiply);
        int divide = ArithmeticOperation.divide(10, 5);
        System.out.println("Divide is : " + divide);
        int factorial = ArithmeticOperation.factorial(5);
        System.out.println("Factorial is : " + factorial);
        int reverse = ArithmeticOperation.reverse(3456);
        System.out.println("The reverse of the given number is : " + reverse);
    }
}
