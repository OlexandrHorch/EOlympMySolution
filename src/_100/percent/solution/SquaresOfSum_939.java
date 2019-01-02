package _100.percent.solution;
/*
 * Квадрат суми 100%
 * https://www.e-olymp.com/uk/problems/939
 */

import java.util.Scanner;

public class SquaresOfSum_939 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit = input.nextInt();
        int a = digit / 10;
        int b = ( digit % 10 ) % 10;
        int result = (int) Math.pow(a + b, 2);
        System.out.println(result);
    }
}

/*
Квадрат суми
Знайти квадрат суми цифр двоцифрового натурального числа.

Вхідні дані
Одне натуральне двоцифрове число.

Вихідні дані
Квадрат суми цифр заданого числа.

Вхідні дані
23
Вихідні дані
25
*/