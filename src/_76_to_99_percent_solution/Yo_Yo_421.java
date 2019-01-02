package _76_to_99_percent_solution;
/*
Йо-Йо 90%
https://www.e-olymp.com/uk/problems/421
*/
import java.util.Scanner;

public class Yo_Yo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        int k = input.nextInt();

        int numbersLift = -1;

        for (double lengthAfterLift = length; lengthAfterLift > 1; lengthAfterLift = lengthAfterLift / k) {
            numbersLift += 1;
        }

        System.out.println(numbersLift);
    }
}