/*
 * COS 201 - Week 3
 * Debugging exercise: integer division.
 *
 * The original expression:
 *     double result = firstNumber / secondNumber;
 * performs integer division first, so it prints 2.0.
 * Casting the first operand to double before dividing gives 2.5.
 */
public class CalculationError {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 2;
        double result = (double) firstNumber / secondNumber;
        System.out.println(result);
    }
}
