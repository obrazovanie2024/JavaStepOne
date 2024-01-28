package dmdev.homeworks.homework1;

import java.util.Scanner;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * Протестировать функцию в main.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 0 до 59: ");
        int minutes = scanner.nextInt();
        if(validateMinutes(minutes)) {
            defineQuarterText(minutes);
        } else {
            System.out.println("Введённое число находится вне предложенного диапазона.");
        }
    }

    static boolean validateMinutes(int value) {
        return 0 <= value && value < 60;
    }

    static void defineQuarterText(int value) {

        if (0 <= value && value <= 14) {
            System.out.println("Первая четверть | The first quarter");
        }
        if (15 <= value && value <= 29) {
            System.out.println("Вторая четверть | The second quarter");
        }
        if (30 <= value && value <= 44) {
            System.out.println("Третья четверть | The third quarter");
        }
        if (45 <= value && value <= 59) {
            System.out.println("Четвёртая четверть | The fourth quarter");
        }

    }

}
