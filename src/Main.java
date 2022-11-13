import java.util.Scanner;

public class Main {
    private static final String word = "ярослав";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Угадай слово");
        int length = word.length();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < word.length(); i++) {
            stringBuilder.append('_');
        }


        String wordMask = stringBuilder.toString();

        System.out.println(wordMask);

        do {
            System.out.println("Введите букву");
            char c = input.next().charAt(0);

            if (word.indexOf(c) >= 0) {
                System.out.println("Такая буква есть");

                for (int i = 1; i < word.length(); i++) {
                    if (word.charAt(i) == c) {
                        wordMask = replaceLetter(Character.toString(c), wordMask);
                    }
                }
                System.out.println(wordMask);
            } else {
                System.out.println("Попробуй снова");
            }
        } while (wordMask.contains("-"));
    }


    private static String replaceLetter(String letter, String wordMask) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter.charAt(0)) {
                stringBuilder.append(letter);
            } else if (wordMask.charAt(i) != ('-')) {
                stringBuilder.append(wordMask.charAt(i));
            } else {
                stringBuilder.append('-');
            }
        }
            return stringBuilder.toString();
    }
}