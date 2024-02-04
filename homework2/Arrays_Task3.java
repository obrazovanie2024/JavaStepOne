package homework2;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * Пример:
 *                                          [-4, -18]
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 *                                          [1, 9, 3]
 */

public class Arrays_Task3 {
    public static void main(String[] args) {
        int[] oneDimArr = {-100, -3, -2, -1, 0, 1, 2, 3, 100, 0};
        int[][] twoDimArrFromOneDimArr = createTwoDimArrFromOneDimArr(oneDimArr);
        for (int[] simpleArray : twoDimArrFromOneDimArr) {
            Arrays_Task1.printElementsOfArray(simpleArray);
            System.out.println();
        }
    }

    private static int[][] createTwoDimArrFromOneDimArr(int[] array) {
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;
        for (int element : array) {
            if (element > 0) {
                positiveCounter++;
            }
            if (element < 0) {
                negativeCounter++;
            }
            if (element == 0) {
                zeroCounter++;
            }
        }
        int[] positiveArray = new int[positiveCounter];
        int[] negativeArray = new int[negativeCounter];
        int[] zeroArray = new int[zeroCounter];
        positiveCounter = 0;
        negativeCounter = 0;
        zeroCounter = 0;
        for (int element : array) {
            if (element > 0) {
                positiveArray[positiveCounter] = element;
                positiveCounter++;
            }
            if (element < 0) {
                negativeArray[negativeCounter] = element;
                negativeCounter++;
            }
            if (element == 0) {
                zeroArray[zeroCounter] = element;
                negativeCounter++;
            }
        }
        return new int[][]{ positiveArray, negativeArray, zeroArray };
    }
}
