package in.stage.of.resolution;
/*
 * Різниця ___%
 * https://www.e-olymp.com/uk/problems/941
 */

import java.util.Scanner;

public class Difference_941 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int moduleOfNumber = Math.abs(number);

        int[] array = new int[3];
        int numberDivided;
        for (int i = 2; moduleOfNumber > 0; moduleOfNumber /= 10) {
            numberDivided = moduleOfNumber % 10;
            array[i] = numberDivided;
            i--;
        }

        int product = array[0] * array[1] * array[2];
        int sum = array[0] + array[1] + array[2];
        int result = product - sum;
        System.out.print(result);
    }
}

/*
Різниця
Знайти різницю між добутком і сумою цифр даного трицифрового числа.

Вхідні дані
У єдиному рядку задане трицифрове число.

Вихідні дані
Шукана різниця.

Вхідні дані #1
198
Вихідні дані #1
54
*/