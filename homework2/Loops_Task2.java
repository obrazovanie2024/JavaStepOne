package homework2;

import java.util.Scanner;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */

public class Loops_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        System.out.println(reverseNumber(number));
    }

    private static long reverseNumber(long number) {
        long reversedNumber = 0;
        int numberOfDigits = countDigitsInNumber(number);
        for (int i = numberOfDigits; i > 0; i--) {
            reversedNumber += (number % 10) * ((long) Math.pow(10, i-1));
            number /= 10;
        }
        return reversedNumber;
    }

    private static int countDigitsInNumber(long number) {
        int digitsNumber = 1;
        for (long i = number; i / 10 != 0; i /= 10) {
            digitsNumber++;
        }
        return digitsNumber;
    }

}
