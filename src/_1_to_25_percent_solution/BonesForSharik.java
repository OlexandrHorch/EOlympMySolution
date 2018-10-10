package In_stage_of_resolution;
/*
Косточки для Шарика ___%
https://www.e-olymp.com/uk/problems/637
*/
import java.util.Scanner;

public class BonesForSharik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        int size = side * side;
        double sumBones = 0;

        double[] bones = new double[size];

        if (size == 1) {
            bones[0] = 1;
        } else {
            bones[0] = 1;
            for (int i = 1; i < bones.length; i++) {
                bones[i] = bones[i - 1] * 2;
            }
        }

        for (int i = 0; i < bones.length; i++){
            sumBones += bones[i];
        }

        System.out.print(String.format("%.0f", sumBones));
    }
}