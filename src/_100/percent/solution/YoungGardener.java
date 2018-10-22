package _100.percent.solution;
/*
Юний садівник 100%
https://www.e-olymp.com/uk/problems/248
*/
import java.util.Scanner;

public class YoungGardener {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberTiers = scanner.nextInt();
        int leafsAtNextTier = 0;
        int liters = 1;

        for (int n = numberTiers; n > 0; n--) {
            leafsAtNextTier += 2;
            liters += leafsAtNextTier;
        }

        System.out.println(liters);
    }
}