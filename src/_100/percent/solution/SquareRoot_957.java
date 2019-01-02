package in.stage.of.resolution;
/*
 * Квадратний корінь ___%
 * https://www.e-olymp.com/uk/problems/957
 */

import java.util.Scanner;

public class SquareRoot_957 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        double sum = 0;
        int numberDivided;
        for (int i = 2; number > 0; number /= 10) {
            numberDivided = number % 10;
            sum += numberDivided;
            i--;
        }

        double result = Math.sqrt(sum);
        System.out.printf("%.3f", result);
    }
}

/*
Квадратний корінь
Знайти квадратний корінь суми цифр трицифрового натурального числа.

Вхідні дані
Одне натуральне трицифрове число.

Вихідні дані
Вивести квадратний корінь суми цифр з 3 десятковими цифрами.

Вхідні дані #1
178
Вихідні дані #1
4.000
*/