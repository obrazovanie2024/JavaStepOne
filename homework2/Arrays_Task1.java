package homework2;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */

public class Arrays_Task1 {
    public static void main(String[] args) {
        int[] arrayWithAnySignNumbers = { 3, 5, -6, 3, 2, -9, 0, -123, 22, 44, -66, 99, 100000, -100000, 2147483647, -2147483648 };
        int[] arrayWithPositiveNumbersOnly = createArrayWithOnlyPositiveNumbers(arrayWithAnySignNumbers);
        printElementsOfArray(arrayWithPositiveNumbersOnly);
        long[] multipliedArray = multiplyElementsByArrayLength(arrayWithPositiveNumbersOnly);
        System.out.println();
        printElementsOfArray(multipliedArray);
    }

    private static long[] multiplyElementsByArrayLength(int[] array) {
        long length = array.length;
        long[] longArray = new long[array.length];
        for (int i = 0; i < length; i++) {
            longArray[i] = array[i] * length;
        }
        return longArray;
    }

    //сделан публичным для использования в других домашних заданиях
    public static void printElementsOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
    }

    private static void printElementsOfArray(long[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
    }

    private static int[] createArrayWithOnlyPositiveNumbers(int[] arrayWithAnySignNumbers) {
        int positiveNumbersCounter = 0;
        for (int value : arrayWithAnySignNumbers) {
            if (isPositive(value)) {
                positiveNumbersCounter++;
            }
        }
        int counter = 0;
        int[] newArray = new int[positiveNumbersCounter];
        for (int value : arrayWithAnySignNumbers) {
            if (isPositive(value)) {
                newArray[counter] = value;
                counter++;
            }
        }
        return newArray;
    }

    private static boolean isPositive(int value) {
        return value > 0;
    }
}
