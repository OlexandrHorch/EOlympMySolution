package _100.percent.solution;
/*
* Камінь, Ножиці чи Папір? 100%
* https://www.e-olymp.com/uk/problems/1215
*/
import java.util.Scanner;

public class StoneScissorsPaper_1215 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberTests = input.nextInt();
        String[][][] tests = new String[numberTests][100][2];
        for (int i = 0; i < numberTests; i++) {
            int rounds = input.nextInt();
            for (int r = 0; r < rounds; r++) {
                tests[i][r][0] = input.next();
                tests[i][r][1] = input.next();
            }
        }


        for (int i = 0; i < numberTests; i++) {
            int resultCalc = 0;

            for (int r = 0; r < 100; r++) {
                if (tests[i][r][0] != null) {
                    if (tests[i][r][0].equals("R") && tests[i][r][1].equals("S")) {
                        resultCalc += 1;
                    } else if (tests[i][r][0].equals("S") && tests[i][r][1].equals("R")) {
                        resultCalc -= 1;
                    } else if (tests[i][r][0].equals("P") && tests[i][r][1].equals("R")) {
                        resultCalc += 1;
                    } else if (tests[i][r][0].equals("R") && tests[i][r][1].equals("P")) {
                        resultCalc -= 1;
                    } else if (tests[i][r][0].equals("S") && tests[i][r][1].equals("P")) {
                        resultCalc += 1;
                    } else if (tests[i][r][0].equals("P") && tests[i][r][1].equals("S")) {
                        resultCalc -= 1;
                    }
                }
            }

            if (resultCalc > 0) {
                System.out.println("Player 1");
            } else if (resultCalc < 0) {
                System.out.println("Player 2");
            } else {
                System.out.println("TIE");
            }
        }
    }
}

/*
Камінь, Ножиці чи Папір?
У гру Камінь, Ножиці, Папір грають двоє. Кожен гравець на рахунок три одночасно вибирає один з трьох предметів.
Гра триває певну наперед встановлену кількість раундів. Гравець, який виграє більшу частину раундів, оголошується переможцем.
За заданою кількістю раундів та їх результатам необхідно визначити переможця.

Наступні правила описують правила перемоги:
Камінь завжди перемагає Ножиці (Камінь раздавлює Ножиці)
Ножиці завжди перемагають Папір (Ножиці ріжуть Папір)
Папір завжди перемагає Камінь (Папір покриває Камінь)

Вхідні дані
Перший рядок містить кількість тестів t (0 < t < 1000).
Перший рядок кожного тесту містить кількість раундів n (0 < n < 100), зіграних у гру Камінь, Ножиці, Папір.
Кожен з наступних n рядків містить одну з великих літер R (Камінь), P (Папір) або S (Ножиці), пропуск і знову велику літеру R, P чи S.
Перша літера позначає вибір першого гравця; друга літера - вибір другого гравця.

Вихідні дані
Для кожного тесту в окремому рядку вивести ім'я переможця (Player 1 чи Player 2). Якщо гра завершується унічию, вивести TIE.

Вхідні дані #1
3
2
R P
S R
3
P P
R S
S R
1
P R

Вихідні дані #1
Player 2
TIE
Player 1
*/


//        // Друк масиву "tests"
//        for (int i = 0; i < numberTests; i++) {
//            for (int r = 0; r < 100; r++) {
//                if (tests[i][r][0] != null) {
//                    System.out.println("TEST_" + ( i + 1 ) + " round_" + ( r + 1 ) + " - " +
//                            ( tests[i][r][0] ) + " " + ( tests[i][r][1] ));
//                }
//            }
//        }