package in.stage.of.resolution;
/*
* Розклад трицифрового числа ___%
* https://www.e-olymp.com/uk/problems/935
*/
import java.util.Scanner;

public class DecompositionThree_digitNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int numberModule = Math.abs(number);

        // Визначення довжини числа
        int numberDuplicate1 = numberModule;
        int numberDivided;
        int quantityNumeralInNumber = 0;
        for (; numberDuplicate1 > 0; numberDuplicate1 /= 10) {
            numberDivided = numberDuplicate1 % 10;
            quantityNumeralInNumber += 1;
        }

        // Перетворення числа в масив цифр
        int numberDuplicate2 = numberModule;
        int[] numeralArray = new int[quantityNumeralInNumber];
        int numberDivided2;
        int index = quantityNumeralInNumber;
        for (; numberDuplicate2 > 0; numberDuplicate2 /= 10) {
            numberDivided2 = numberDuplicate2 % 10;
            index -= 1;
            numeralArray[index] = numberDivided2;
        }

        // Вивід масива в консоль
        for (int i = 0; i < numeralArray.length; i++) {
            System.out.println(numeralArray[i]);
        }

    }
}

/*
Розклад трицифрового числа
Розкласти задане трицифрове число на цифри.

Вхідні дані
Одне ціле трицифрове число (додатнє чи від'ємне).

Вихідні дані
Вивести кожну цифру числа в окремому рядку як наведено у прикладі.

Вхідні дані #1
198
Вихідні дані #1
1
9
8

Вхідні дані #2
-232
Вихідні дані #2
2
3
2
*/