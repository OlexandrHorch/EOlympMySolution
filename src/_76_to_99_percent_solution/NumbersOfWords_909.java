package _76_to_99_percent_solution;
/*
 * Кількість слів 83%
 * https://www.e-olymp.com/uk/problems/909
 */

import java.util.Scanner;

public class NumbersOfWords_909 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        String[] wordsArray = text.split("[ ]");


        // ВИДАЛИТИ - - - - - - - - - - -
        for (int i = 0; i < wordsArray.length; i++) {
            System.out.println(wordsArray[i]);
        }
        // - - - - - - - - - - - - - - - -




        System.out.println(wordsArray.length);
    }
}

// "Hello world!"           з 1-м пропуском між словами     - результат 2 (вірно)
// "Hello     world!"       з 5-ма пропусками між словами   - результат 6 (помилка)

/*
Кількість слів
Визначити кількість слів у заданому фрагменті тексту.

Вхідні дані
В єдиному рядку задано фрагмент тексту на англійській мові, кількість символів у якому не перевищує 250.
Гарантується, що у тексті відсутні тире, дефіси, цифри і числа.

Вихідні дані
Єдине число - кількість слів у фрагменті.

Вхідні дані #1
Hello world!
Вихідні дані #1
2

Вхідні дані #2
Hello world! Hello,    country!
Вихідні дані #2
4
*/