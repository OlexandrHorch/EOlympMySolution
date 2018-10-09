package _100_percent_solution;
/*
Пиріжки +100%
https://www.e-olymp.com/uk/problems/7336
*/
import java.util.Scanner;

public class Cakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hrn = scanner.nextInt();
        int cop = scanner.nextInt();
        int cakesNumber = scanner.nextInt();

        int oneCakeCostCop = hrn*100 + cop;
        int nCakesCostCopF = oneCakeCostCop * cakesNumber;
        int nCakesCostHrn = nCakesCostCopF/100;
        int nCakesCostCop = nCakesCostCopF%100;

        System.out.println(nCakesCostHrn+ " " +nCakesCostCop);
    }
}