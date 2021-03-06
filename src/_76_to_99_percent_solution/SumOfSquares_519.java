package _76_to_99_percent_solution;
/*
Сума квадратів 91%
https://www.e-olymp.com/uk/problems/519
*/

import java.util.Scanner;

public class SumOfSquares_519 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        long A = (long) Math.pow(a, 2);
        long B = (long) Math.pow(b, 2);

        System.out.println(A + B);
    }
}

/*
Сума квадратів
Знайти суму квадратів двох чисел.

Вхідні дані
Два цілих числа a та b. Числа не перевищують 109 за абсолютною величиною.

Вихідні дані
Виведіть одне ціле число a2 + b2.

Вхідні дані #1
2 3
Вихідні дані #1
13
*/