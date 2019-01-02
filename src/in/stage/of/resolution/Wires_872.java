package in.stage.of.resolution;
/*
* Проводи ___%
* https://www.e-olymp.com/uk/problems/872
*/
import java.util.Scanner;

public class Wires_872 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int numberSegments = input.nextInt();
        int[] arrayOfWires = new int[size];
        for (int i = 0; i < size; i++) {
            arrayOfWires[i] = input.nextInt();
        }


        int sizeSegments = 1;
        int sizeSegmentsCalc = 0;
        int numberSegmentsCalc = 0;

        if (numberSegments >= numberSegmentsCalc) {
            numberSegmentsCalc = 0;
            for (int i = 0; i < size; i++) {
                int wire = arrayOfWires[i];
                if (wire > 0) {
                    wire--;
                    numberSegmentsCalc++;
                }
            }
            sizeSegments++;
            System.out.println("розмір сегмента " + sizeSegments + "\t | кількість сегментів " + numberSegmentsCalc);

        } else if (numberSegments < numberSegmentsCalc) {
            for (int i = 0; i < size; i++) {
                int wire = arrayOfWires[i];
                if (wire > 0) {
                    wire--;
                    numberSegmentsCalc++;
                }
            }
            sizeSegments++;
            System.out.println("розмір сегмента " + sizeSegments + "\t | кількість сегментів " + numberSegmentsCalc);
        }


    }
}

/*
Проводи
Задано N відрізків проводу довжиною L1, L2, ..., LN сантиметрів.
Потрібно при допомозі розрізання отримати з них K рівних відрізків якомога більшої довжини, яка задається цілим числом сантиметрів.
Якщо не можна отримати K відрізків довжиною навіть 1 см, вивести 0.

Вхідні дані
У першому рядку знаходяться числа N і К. У наступних N рядках - L1, L2, ..., LN, по одному числу у рядку.
1 ≤ N ≤ 10 000, 1 ≤ K ≤ 10 000, 100 ≤ Li ≤ 10 000 000, всі числа цілі.

Вихідні дані
Вивести одне число - отриману довжину відрізків.

Вхідні дані
4 11
802
743
457
539

Вихідні дані
200
*/