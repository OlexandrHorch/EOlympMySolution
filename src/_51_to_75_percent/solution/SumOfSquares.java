package _51_to_75_percent.solution;
/*
Сума квадратів 73%
https://www.e-olymp.com/uk/problems/519
*/

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int A = (int) Math.pow(a, 2);
        int B = (int) Math.pow(b, 2);

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