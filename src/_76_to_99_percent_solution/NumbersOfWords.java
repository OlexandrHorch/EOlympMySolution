package _76_to_99_percent_solution;
/*
 * Кількість слів 83%
 * https://www.e-olymp.com/uk/problems/909
 */

import java.util.Scanner;

public class NumbersOfWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        String[] wordsArray = text.split("[ ]");


        // ВИДАЛИТИ - - - - - - - - - - -
        for (int i = 0; i < wordsArray.length; i++) {
            System.out.print(wordsArray[i]);
        }
        // - - - - - - - - - - - - - - - -




        System.out.println(wordsArray.length);
    }
}

// "Hello world!"           з 1-м пропуском між словами     - результат 2 (вірно)
// "Hello     world!"       з 5-ма пропусками між словами   - результат 6 (помилка)