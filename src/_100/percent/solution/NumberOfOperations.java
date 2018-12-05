package in.stage.of.resolution;
/*
 * Кількість операцій 100%
 * https://www.e-olymp.com/uk/problems/901
 */

import java.util.Scanner;

public class NumberOfOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String arithmeticExpression = input.next();

        char[] arrayArEx = arithmeticExpression.toCharArray();

        String[] arrayInString = new String[arrayArEx.length];
        for (int i = 0; i < arrayInString.length; i++) {
            arrayInString[i] = Character.toString(arrayArEx[i]);
        }

        int count = 0;
        for (int i = 1; i < arrayArEx.length; i++) {
            if (arrayInString[i].equals("+") || arrayInString[i].equals("-") || arrayInString[i].equals("*")) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}

/*
Кількість операцій
Визначити загальну кількість операцій додавання (+), віднімання (-) та множення (*) у заданому арифметичному виразі.

Вхідні дані
У єдиному рядку задано арифметичний вираз без дужок та пропусків. Кількість символів у виразі не перевищує 250.

Вихідні дані
Вивести кількість вказаних операцій.

Вхідні дані #1
-1+2*3+a
Вихідні дані #1
3
*/