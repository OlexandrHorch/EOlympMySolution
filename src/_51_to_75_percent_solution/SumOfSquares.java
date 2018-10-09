package _51_to_75_percent_solution;
/*
Сума квадратів 73%
https://www.e-olymp.com/uk/problems/519
*/
import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.next());
        int b = Integer.parseInt(input.next());
        int sumOfSquares = (int) (Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(sumOfSquares);
    }
}