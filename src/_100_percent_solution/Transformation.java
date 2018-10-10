package In_stage_of_resolution;
/*
Перетворенння 100%

*/
import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int numbersOperation = 0;

        for (; number > 1; ) {
            if (( number % 2 ) == 0) {
                number = number / 2;
                numbersOperation++;
            } else if (( number % 1 ) == 0) {
                number = number + 1;
                numbersOperation++;
            }
        }
        System.out.println(numbersOperation);
    }
}