package dmdev.practices.practice1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Задача 1
 * Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
 * Вывести дату следующего дня в формате "День.Месяц.Год".
 * Учесть переход на следующий месяц, а также следующий год.
 * Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
 */

public class Task1_modern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = scanner.nextInt();
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.print("Введите год: ");
        int year = scanner.nextInt();System.out.println();
        System.out.println(formatDate(day, month, year));
    }

    static String formatDate(int day, int month, int year) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate someDate = LocalDate.of(year, month, day);
        String enteredDate = "По введёным данным получена следующая дата: " + someDate.format(dateTimeFormatter);
        String tomorrowToEnteredDate = "Следующий день относительно этой даты: " + someDate.plusDays(1).format(dateTimeFormatter);
        return enteredDate + "\n" + tomorrowToEnteredDate;
    }

}
