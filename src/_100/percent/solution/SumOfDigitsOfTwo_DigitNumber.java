package in.stage.of.resolution;
/*
 * Сума цифр двоцифрового числа 50%
 * https://www.e-olymp.com/uk/problems/933
 */

import java.util.Scanner;

public class SumOfDigitsOfTwo_DigitNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit = input.nextInt();
        int a = Math.abs(digit / 10);
        int b = Math.abs(( digit % 10 ) % 10);

        System.out.println(a + b);
    }
}

/*
Сума цифр двоцифрового числа
Знайти суму цифр даного двоцифрового числа.

Вхідні дані
У єдиному рядку задане двоцифрове ціле число.

Вихідні дані
У єдиному рядку сума його цифр.

Вхідні дані
23
Вихідні дані
5
*/