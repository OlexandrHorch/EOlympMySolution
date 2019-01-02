package in.stage.of.resolution;
/*
 * Сума крайніх 100%
 * https://www.e-olymp.com/uk/problems/959
 */

import java.util.Scanner;

public class SumOfExtreme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Перетворення числа в масив цифр
        int numberDuplicate = number;
        int[] numeralArray = new int[4];
        int numberDivided;
        int index = 3;
        for (; numberDuplicate > 0; numberDuplicate /= 10) {
            numberDivided = numberDuplicate % 10;
            numeralArray[index] = numberDivided;
            index--;
        }

        int result = numeralArray[0] + numeralArray[3];
        System.out.println(result);
    }
}

/*
Сума крайніх
Знайти суму крайніх цифр чотирицифрового натурального числа.

Вхідні дані
Одне натуральне чотирицифрове число.

Вихідні дані
Вивести суму крайніх цифр числа.

Вхідні дані #1
1235
Вихідні дані #1
6
*/