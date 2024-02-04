package homework2;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */

public class Arrays_Task2 {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', '1', '2', '3', '+', '-', '='};
        int[] codesOfCharArray = createArrayWithCodesOfCharArray(charArray);
        Arrays_Task1.printElementsOfArray(codesOfCharArray);
        int arithmeticMean = calculateArithmeticMeanOfArrayElements(codesOfCharArray);
        System.out.println();
        printElementsGreaterThanArithmeticMean(codesOfCharArray, arithmeticMean);
    }

    private static void printElementsGreaterThanArithmeticMean(int[] array, int arithmeticMean) {
        for (int element : array) {
            if (element > arithmeticMean) {
                System.out.println(element + " greater than arithmetic mean " + arithmeticMean);
            }
        }
    }

    private static int calculateArithmeticMeanOfArrayElements(int[] array) {
        int arrayLength = array.length;
        int result = 0;
        for (int i : array) {
            result += i;
        }
        return result / arrayLength;
    }

    private static int[] createArrayWithCodesOfCharArray(char[] charArray) {
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = charArray[i];
        }
        return intArray;
    }
}
