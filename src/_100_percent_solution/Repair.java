package _100_percent_solution;
/*
Ремонт 100%
https://www.e-olymp.com/uk/problems/500
*/
import java.util.Scanner;

public class Repair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbersOrders = input.nextInt();

        int[][] arrayOrders = new int[numbersOrders][3];

        for (int numberOrder = 0; numberOrder < numbersOrders; numberOrder++) {
            arrayOrders[numberOrder][0] = Integer.parseInt(input.next());
            arrayOrders[numberOrder][1] = Integer.parseInt(input.next());
            arrayOrders[numberOrder][2] = Integer.parseInt(input.next());
        }

        for (int numberOrder = 0; numberOrder < numbersOrders; numberOrder++) {
            int wallsSquare = arrayOrders[numberOrder][0] * arrayOrders[numberOrder][2] * 2 + arrayOrders[numberOrder][1] * arrayOrders[numberOrder][2] * 2;
            double numbersPaintCan = Math.ceil((double) wallsSquare / 16);
            System.out.println((int) numbersPaintCan);
        }
    }
}