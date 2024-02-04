package homework2;

import java.util.Scanner;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */

public class Loops_Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long enteredNumber = scanner.nextLong();
        int numberOfEvenDigits = countEvenDigits(enteredNumber);
        int numberOfOddDigits = countOddDigits(enteredNumber);
        System.out.println("The number " + enteredNumber + " contains " + numberOfEvenDigits + " even digits and " + numberOfOddDigits + " odd digits.");
    }

    private static int countEvenDigits(long enteredNumber) {
        int counter = 0;
        while (enteredNumber != 0) {
            if ((enteredNumber % 10 % 2) == 0) {
                counter++;
            }
            enteredNumber /= 10;
        }
        return counter;
    }

    private static int countOddDigits(long enteredNumber) {
        int counter = 0;
        while (enteredNumber != 0) {
            if ((enteredNumber % 10 % 2) != 0) {
                counter++;
            }
            enteredNumber /= 10;
        }
        return counter;
    }

}
