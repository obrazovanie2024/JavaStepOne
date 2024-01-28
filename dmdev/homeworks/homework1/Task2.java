package dmdev.homeworks.homework1;

/**
 * Даны 3 переменные:
 *-
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 *-
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 *-
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */

public class Task2 {
    public static void main(String[] args) {
        double operand1 = 24.4;
        double operand2 = 10.1;
        char operation = '+';
        System.out.println(calculate(operand1, operand2, operation) + " (" + operand1 + " " + operation + " " + operand2 + ")");
    }

    static double calculate(double operand1, double operand2, char operation) {
        double result = 0.0;
        switch (operation) {
            case '+' -> result = operand1 + operand2;
            case '-' -> result = operand1 - operand2;
            case '*' -> result = operand1 * operand2;
            case '/' -> result = operand1 / operand2;
            case '%' -> result = operand1 % operand2;
        }
        return result;
    }
}
