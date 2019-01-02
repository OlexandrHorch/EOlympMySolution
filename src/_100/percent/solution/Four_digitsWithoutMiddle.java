package _100.percent.solution;
/*
 * Чотирицифрове без середніх 100%
 * https://www.e-olymp.com/uk/problems/961
 */

import java.util.Scanner;

public class Four_digitsWithoutMiddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Перетворення числа в масив цифр
        int numberDuplicate = number;
        int[] numeralArray = new int[4];
        int numberDivided;
        for (int i =3; numberDuplicate > 0; numberDuplicate /= 10) {
            numberDivided = numberDuplicate % 10;
            numeralArray[i] = numberDivided;
            i--;
        }

        int result = numeralArray[0] * 10 + numeralArray[3];
        System.out.println(result);
    }
}

/*
Чотирицифрове без середніх
Записати задане чотирицифрове натуральне число без середніх цифр.

Вхідні дані
У єдиному рядку записано задане натуральне чотирицифрове число.

Вихідні дані
Очікувана відповідь.

Вхідні дані
1023
Вихідні дані
13
*/