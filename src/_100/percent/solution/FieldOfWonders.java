package _100_percent_solution;
/*
Поле-чудес 100%
https://www.e-olymp.com/uk/problems/7340
*/
import java.util.Arrays;
import java.util.Scanner;

public class FieldOfWonders {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();

        char[] wordInArray = word.toCharArray();

        Arrays.sort(wordInArray);

        int countDifferentLetters = 1;

        for (int i = 1; i < wordInArray.length; i++) {
            if (wordInArray[i - 1] != wordInArray[i]) {
                countDifferentLetters += 1;
            }
        }

        System.out.println(countDifferentLetters);
    }
}