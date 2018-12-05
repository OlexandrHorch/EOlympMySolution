package _76_to_99_percent_solution;
/*
 * Відношення добутку до суми 90%
 * https://www.e-olymp.com/uk/problems/931
 */

import java.util.Scanner;

public class RatioProductToAmount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.next();

        // Перетворення стрічки в масив символів
        char[] numberInCharArray = number.toCharArray();

        // Перетворення масива символів в масив цифр
        double[] numeralArray = new double[number.length()];
        for (int i = 0; i < numeralArray.length; i++) {
            numeralArray[i] = Character.getNumericValue(numberInCharArray[i]);
        }

        double amount = 0;
        for (int i = 0; i < numeralArray.length; i++) {
            amount += numeralArray[i];
        }

        double product = numeralArray[0];
        for (int i = 1; i < numeralArray.length; i++) {
            product = product * numeralArray[i];
        }

        double result = product / amount;
        System.out.printf("%.3f", result);
    }
}

/*
Відношення добутку до суми
Обчислити відношення добутку цифр натурального числа до їх суми.

Вхідні дані
Натуральне число n, що не перевищує 2·109.

Вихідні дані
Вивести відношення добутку цифр числа n до їх суми з 3 десятковими цифрами.

Ліміт часу 1 секунда
Ліміт використання пам'яті 128 MiB
Вхідні дані #1
36
Вихідні дані #1
2.000
*/