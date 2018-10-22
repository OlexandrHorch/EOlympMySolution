package _76_to_99_percent_solution;
/*
Прогрес в артилерії починається 95%
https://www.e-olymp.com/uk/problems/358
*/
import java.util.Scanner;

public class ProgressInArtilleryBegins {
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

        int quantityLED = 0;
        for (int i = 0; i < numeralArray.length; i++) {
            if (numeralArray[i] == 0) {
                quantityLED += 6;
            } else if (numeralArray[i] == 1) {
                quantityLED += 2;
            } else if (numeralArray[i] == 2) {
                quantityLED += 5;
            } else if (numeralArray[i] == 3) {
                quantityLED += 5;
            } else if (numeralArray[i] == 4) {
                quantityLED += 4;
            } else if (numeralArray[i] == 5) {
                quantityLED += 5;
            } else if (numeralArray[i] == 6) {
                quantityLED += 6;
            } else if (numeralArray[i] == 7) {
                quantityLED += 3;
            } else if (numeralArray[i] == 8) {
                quantityLED += 7;
            } else if (numeralArray[i] == 9) {
                quantityLED += 6;
            }
        }

        System.out.println(quantityLED);
    }
}