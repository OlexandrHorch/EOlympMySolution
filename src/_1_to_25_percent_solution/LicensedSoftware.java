package in.stage.of.resolution;
/*
 * Ліцензійне ПЗ ___%
 * https://www.e-olymp.com/uk/problems/255
 */

import java.util.Scanner;

public class LicensedSoftware {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();


        int numberDuplicate1 = number;
        int numberDivided;
        int quantityNumeralInNumber = 0;
        for (; numberDuplicate1 > 0; numberDuplicate1 /= 10) {
            numberDivided = numberDuplicate1 % 10;
            quantityNumeralInNumber += 1;
        }


        int numberDuplicate2 = number;
        int[] numeralArray = new int[quantityNumeralInNumber];
        int numberDivided2;
        int index = quantityNumeralInNumber;
        for (; numberDuplicate2 > 0; numberDuplicate2 /= 10) {
            numberDivided2 = numberDuplicate2 % 10;
            index -= 1;
            numeralArray[index] = numberDivided2;
        }


        int sumOfDigits = 0;
        for (int i = 0; i < numeralArray.length; i++) {
            sumOfDigits += numeralArray[i];
        }


        if (sumOfDigits < 10) {
            System.out.println(sumOfDigits);
        } else {
            System.out.println(Math.sqrt(sumOfDigits));
        }
    }
}

/*
Для довільного числа цифровий корінь визначається наступним чином:
Якщо сума цифр числа менше десяти, то цифровий корінь і є сума цифр цього числа.
У протилежному випадку цифровий корінь числа дорівнює цифровому кореню суми його цифр.

Вхідні дані
Єдине число n (0 ≤ n ≤ 2 31- 1).

Вихідні дані
Вивести одне число - відповідь на поставлену задачу.
*/

/*
import java.util.Scanner;

public class LicensedSoftware {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Визначення довжини числа
        int numberDuplicate1 = number;
        int numberDivided;
        int quantityNumeralInNumber = 0;
        for (; numberDuplicate1 > 0; numberDuplicate1 /= 10) {
            numberDivided = numberDuplicate1 % 10;
            quantityNumeralInNumber += 1;
        }

        // Перетворення числа в масив цифр
        int numberDuplicate2 = number;
        int[] numeralArray = new int[quantityNumeralInNumber];
        int numberDivided2;
        int index = quantityNumeralInNumber;
        for (; numberDuplicate2 > 0; numberDuplicate2 /= 10) {
            numberDivided2 = numberDuplicate2 % 10;
            index -= 1;
            numeralArray[index] = numberDivided2;
        }

        // Визначення суми цифр числа
        int sumOfDigits = 0;
        for (int i = 0; i < numeralArray.length; i++) {
            sumOfDigits += numeralArray[i];
        }

        // Виконання логіки задачі
        if (sumOfDigits < 10) {
            System.out.println(sumOfDigits);
        } else {
            System.out.println(Math.sqrt(sumOfDigits));
        }
    }
}
*/