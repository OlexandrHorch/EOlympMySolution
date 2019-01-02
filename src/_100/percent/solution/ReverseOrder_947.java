package in.stage.of.resolution;
/*
 * Зворотній порядок 90%
 * https://www.e-olymp.com/uk/problems/947
 */

import java.util.Scanner;

public class ReverseOrder_947 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Перетворення числа в масив цифр
        int[] numeralArray = new int[3];
        int numberDivided;
        for (int i = 2; number > 0; number /= 10) {
            numberDivided = number % 10;
            numeralArray[i] = numberDivided;
            i--;
        }
        String result = Integer.toString(numeralArray[2]) + Integer.toString(numeralArray[1]) + Integer.toString(numeralArray[0]);
//        int result = numeralArray[2] * 100 + numeralArray[1] * 10 + numeralArray[0];
        System.out.println(result);
    }
}

// 100    001
/*
Зворотній порядок
Записати дане трицифрове натуральне число в зворотному порядку.

Вхідні дані
У єдиному рядку задане натуральне трицифрове число.

Вихідні дані
Запис заданого числа у зворотному порядку.

Вхідні дані
198
Вихідні дані
891
*/