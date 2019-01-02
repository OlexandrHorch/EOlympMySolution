package in.stage.of.resolution;
/*
 * Без середньої ___%
 * https://www.e-olymp.com/uk/problems/945
 */

import java.util.Scanner;

public class WithoutMiddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Перетворення числа в масив цифр
        int numberDuplicate = number;
        int[] numeralArray = new int[3];
        int numberDivided2;
        int index = 3;
        for (; numberDuplicate > 0; numberDuplicate /= 10) {
            numberDivided2 = numberDuplicate % 10;
            index--;
            numeralArray[index] = numberDivided2;
        }

        int result = numeralArray[0] * 10 + numeralArray[2];

        System.out.println(result);
    }
}

/*
Без середньої
Записати дане трицифрове натуральне число без середньої цифри.

Вхідні дані
Одне натуральне трицифрове число.

Вихідні дані
Вивести трицифрове число без середньої цифри.

Вхідні дані #1
198
Вихідні дані #1
18
*/