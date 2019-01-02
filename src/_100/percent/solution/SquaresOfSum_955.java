package _100.percent.solution;
/*
 * Квадрат суми 100%
 * https://www.e-olymp.com/uk/problems/955
 */

import java.util.Scanner;

public class SquaresOfSum_955 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int sum = 0;
        int numberDivided;
        for (int i = 3; number > 0; number /= 10) {
            numberDivided = number % 10;
            sum += numberDivided;
            i--;
        }

        int result = (int) Math.pow(sum, 2);
        System.out.println(result);
    }
}

/*
Квадрат суми
Знайдіть квадрат суми цифр чотирицифрового натурального числа.

Вхідні дані
Одне натуральне чотирицифрове число.

Вихідні дані
Виведіть квадрат суми цифр заданого числа.

Вхідні дані #1
4765
Вихідні дані #1
484
*/