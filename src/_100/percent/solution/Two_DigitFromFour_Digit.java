package in.stage.of.resolution;
/*
 * Двозначне з чотиризначного 100%
 * https://www.e-olymp.com/uk/problems/949
 */

import java.util.Scanner;

public class Two_DigitFromFour_Digit {
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

        int result = numeralArray[1] * 10 + numeralArray[2];
        System.out.println(result);
    }
}

/*
Двозначне з чотиризначного
З даного чотиризначного натурального числа створити двозначне, що складається з його середніх цифр.

Вхідні дані
У єдиному рядку задане чотиризначне натуральне число.

Вихідні дані
Утворене число.

Вхідні дані #1
4765
Вихідні дані #1
76
*/