package homework3.strings.task2;

import java.util.ArrayList;

public class ApplicationRunner {
    public static void main(String[] args) {
        var string = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        var digitsArrayFromString1 = extractDigits1(string);
        var digitsArrayFromString2 = extractDigits2(string);
        var sumOfDigitsFromArray1 = addDigitsFromIntArray1(digitsArrayFromString1);
        var sumOfDigitsFromArray2 = addDigitsFromIntArray2(digitsArrayFromString2);
        System.out.println(sumOfDigitsFromArray1);
        System.out.println(sumOfDigitsFromArray2);
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

}
