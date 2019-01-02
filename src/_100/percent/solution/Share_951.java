package _100.percent.solution;
/*
 * Обмін 100%
 * https://www.e-olymp.com/uk/problems/951
 */

import java.util.Scanner;

public class Share_951 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Перетворення числа в масив цифр
        int numberDuplicate = number;
        int[] numeralArray = new int[4];
        int numberDivided;
        for (int i = 3; numberDuplicate > 0; numberDuplicate /= 10) {
            numberDivided = numberDuplicate % 10;
            numeralArray[i] = numberDivided;
            i--;
        }

        int result = numeralArray[0] * 1000 + numeralArray[2] * 100 + numeralArray[1] * 10 + numeralArray[3];
        System.out.println(result);
    }
}

/*
Обмін
В даному натуральному чотирицифровому числі поміняти місцями середні цифри.

Вхідні дані
У єдиному рядку задане натуральне чотирицифрове число.

Вихідні дані
Нове число.

Вхідні дані
4765
Вихідні дані
4675
*/