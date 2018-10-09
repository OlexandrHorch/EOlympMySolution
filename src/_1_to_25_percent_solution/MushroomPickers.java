package _1_to_25_percent_solution;
/*
Три грибники 10% - ???
https://www.e-olymp.com/uk/problems/2071
*/
import java.util.Scanner;
public class MushroomPickers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int mushNumb = scanner.nextInt();

        int mushNumbPVM = mushNumb/3;

        int mushNumbPetro2 = mushNumbPVM/2;
        int mushNumbMikola2 = mushNumbPVM/2;
        int mushNumbVasil2 = mushNumbPVM + mushNumbPetro2 + mushNumbMikola2;

        int mushNumbPetro1 = mushNumbPetro2/2;
        int mushNumbVasil1 = mushNumbVasil2/2;
        int mushNumbMikola1 = mushNumbMikola2 + mushNumbPetro1 + mushNumbVasil1;

        int mushNumbVasil0 = mushNumbVasil1/2;
        int mushNumbMikola0 = mushNumbMikola1/2;
        int mushNumbPetro0 = mushNumbPetro1 + mushNumbVasil0 + mushNumbMikola0;

        System.out.println(mushNumbPetro0 + " " + mushNumbVasil0 + " " + mushNumbMikola0);
    }
}