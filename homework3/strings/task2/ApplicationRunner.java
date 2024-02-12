package homework3.strings.task2;

import static homework3.strings.util.InventingBrokenBicycle.switchCharDigitsToIntDigits;

import java.util.ArrayList;

public class ApplicationRunner {
    public static void main(String[] args) {
        var string = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        var digitsArrayFromString1 = extractDigits1(string);
        var digitsArrayFromString2 = extractDigits2(string);
        var digitsArrayFromString3 = extractDigits3(string);
        var sumOfDigitsFromArray1 = addDigitsFromIntArray1(digitsArrayFromString1);
        var sumOfDigitsFromArray2 = addDigitsFromIntArray2(digitsArrayFromString2);
        var sumOfDigitsFromArray3 = addDigitsFromIntArray2(digitsArrayFromString3);
        System.out.println(sumOfDigitsFromArray1);
        System.out.println(sumOfDigitsFromArray2);
        System.out.println(sumOfDigitsFromArray3);
    }

    private static int addDigitsFromIntArray1(ArrayList<Integer> digitsArrayFromString) {
        int result = 0;
        for (Integer i : digitsArrayFromString) {
            result += i;
        }
        return result;
    }

    private static int addDigitsFromIntArray2(int[] digitsArrayFromString) {
        int result = 0;
        for (int i : digitsArrayFromString) {
            result += i;
        }
        return result;
    }

    private static ArrayList<Integer> extractDigits1(String string) {
        char[] charArray = string.toCharArray();
        ArrayList<Integer> intArray = new ArrayList<>();
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                intArray.add(Integer.parseInt(String.valueOf(c)));
            }
        }
        return intArray;
    }

    private static int[] extractDigits2(String string) {
        String digitsString = string.replaceAll("\\D", "");
        int digStrLen = digitsString.length();
        int[] intArray = new int[digStrLen];
        for (int i = 0; i < digStrLen; i++) {
            var charInt = digitsString.charAt(i);
            intArray[i] = Integer.parseInt(String.valueOf(charInt));
        }
        return intArray;
    }

    private static int[] extractDigits3(String string) {
        char[] charArray = string.toCharArray();
        int[] intArray = new int[0];
        for (char c : charArray) {
            switch (c) {
                case '1' -> {
                    intArray = switchCharDigitsToIntDigits(intArray);
                    intArray[intArray.length - 1] = 1;
                }
                case '2' -> {
                    intArray = switchCharDigitsToIntDigits(intArray);
                    intArray[intArray.length - 1] = 2;
                }
                case '3' -> {
                    intArray = switchCharDigitsToIntDigits(intArray);
                    intArray[intArray.length - 1] = 3;
                }
                case '4' -> {
                    intArray = switchCharDigitsToIntDigits(intArray);
                    intArray[intArray.length - 1] = 4;
                }
                case '5' -> {
                    intArray = switchCharDigitsToIntDigits(intArray);
                    intArray[intArray.length - 1] = 5;
                }
                case '6' -> {
                    intArray = switchCharDigitsToIntDigits(intArray);
                    intArray[intArray.length - 1] = 6;
                }
                case '7' -> {
                    intArray = switchCharDigitsToIntDigits(intArray);
                    intArray[intArray.length - 1] = 7;
                }
                case '8' -> {
                    intArray = switchCharDigitsToIntDigits(intArray);
                    intArray[intArray.length - 1] = 8;
                }
                case '9' -> {
                    intArray = switchCharDigitsToIntDigits(intArray);
                    intArray[intArray.length - 1] = 9;
                }
                case '0' -> {
                    intArray = switchCharDigitsToIntDigits(intArray);
                    intArray[intArray.length - 1] = 0;
                }
            }
        }
        return intArray;
    }

}
