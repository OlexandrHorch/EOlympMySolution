package _100.percent.solution;
/*
Сума квадратів цифр 100%
https://www.e-olymp.com/uk/problems/8607
*/
import java.util.Scanner;

public class SumSquaresNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int sumSquaresNumbers = 0;

        int numberSep;
        for (; number > 0; number /= 10) {
            numberSep = number % 10;
            sumSquaresNumbers += Math.pow(numberSep, 2);
        }

        System.out.println(sumSquaresNumbers);
    }
}