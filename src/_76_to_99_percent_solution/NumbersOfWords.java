package in.stage.of.resolution;
/*
 * Кількість слів 83%
 * https://www.e-olymp.com/uk/problems/909
 */
import java.util.Scanner;

public class NumbersOfWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        String[] wordsArray = text.split("[ ]");

        System.out.println(wordsArray.length);
    }
}

// Hello world! = 2