package _100_percent_solution;
/*
Сума двох 100%
https://www.e-olymp.com/uk/problems/518
*/
import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbersOfTests = input.nextInt();

        int[][] arrayTests = new int[numbersOfTests][2];

        for (int numberTest = 0; numberTest < numbersOfTests; numberTest++) {
            arrayTests[numberTest][0] = Integer.parseInt(input.next());
            arrayTests[numberTest][1] = Integer.parseInt(input.next());
        }

        for (int numberTest = 0; numberTest < numbersOfTests; numberTest++) {
            System.out.println(arrayTests[numberTest][0] + arrayTests[numberTest][1]);
        }
    }
}