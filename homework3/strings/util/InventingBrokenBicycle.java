package homework3.strings.util;

public class InventingBrokenBicycle {
    public static int[] switchCharDigitsToIntDigits(int[] inputArray) {
        int inArrLen = inputArray.length;
        int[] newArray = new int[inArrLen + 1];
        for (int i = 0; i < inArrLen; i++) {
            newArray[i] = inputArray[i];
        }
        return newArray;
    }
}
