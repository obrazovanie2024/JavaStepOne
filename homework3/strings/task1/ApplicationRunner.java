package homework3.strings.task1;

import java.util.Arrays;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class ApplicationRunner {

    public static final String SPACE = " ";
    public static final String EMPTY = "";

    public static void main(String[] args) {
        String string = "abc Cpddd Dio OsfWw";
        String spacesDeletedString = deleteSpaces(string);
        String uppercasedString = upCase(spacesDeletedString);
        String repeatsDeletedString = deleteRepeats(uppercasedString);
        System.out.println(repeatsDeletedString);
    }

    private static String upCase(String string) {
        return string.toUpperCase();
    }

    private static String deleteSpaces(String string) {
        return string.replace(SPACE, EMPTY);
    }

    private static String deleteRepeats(String string) {
        StringBuilder builtString = new StringBuilder(string);
        for (int i = 0; i < builtString.length(); i++) {
            if (i > 0) {
                if (builtString.charAt(i) == builtString.charAt(i-1)) {
                    builtString.deleteCharAt(i);
                    i -= 1;
                }
            }
        }
        return builtString.toString();
    }

}
