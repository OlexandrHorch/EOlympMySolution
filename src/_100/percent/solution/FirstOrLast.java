package _100.percent.solution;
/*
 * Перша чи остання? 100%
 * https://www.e-olymp.com/uk/problems/903
 */
import java.util.Scanner;

public class FirstOrLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int numberDuplicate2 = number;
        int[] numeralArray = new int[3];
        int numberDivided2;
        int index = 3;
        for (; numberDuplicate2 > 0; numberDuplicate2 /= 10) {
            numberDivided2 = numberDuplicate2 % 10;
            index -= 1;
            numeralArray[index] = numberDivided2;
        }

        if (numeralArray[0] == numeralArray[2]) {
            System.out.println("=");
        } else if (numeralArray[0] > numeralArray[2]) {
            System.out.println(numeralArray[0]);
        } else {
            System.out.println(numeralArray[2]);
        }
    }
}