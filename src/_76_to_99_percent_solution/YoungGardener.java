package _76_to_99_percent_solution;
/*
Юний садівник +94%
https://www.e-olymp.com/uk/problems/248
*/
import java.util.Scanner;

public class YoungGardener {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberTiers = scanner.nextInt();
        int leafsAtNextTier = 2;
        int liters = 3;

        for (int n = numberTiers; n > 1; n--) {
            leafsAtNextTier += 2;
            liters += leafsAtNextTier;
        }

        System.out.println(liters);
    }
}