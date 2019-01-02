package in.stage.of.resolution;
/*
*
* https://www.e-olymp.com/uk/problems/568
*/
/*
Середня зарплата ___%
https://www.e-olymp.com/uk/problems/568
*/

import java.util.Locale;
import java.util.Scanner;

public class AverageSalary {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        String salary = inputData.nextLine();

        String[] strSalaryArray = salary.split("[ ]");

        float[] salaryArray = new float[strSalaryArray.length];
        for (int i = 0; i < strSalaryArray.length; i++) {
            salaryArray[i] = Float.parseFloat(strSalaryArray[i]);
        }

        float sumAllSalary = 0;
        for (int i = 0; i < salaryArray.length; i++) {
            sumAllSalary += salaryArray[i];
            System.out.println(salaryArray[i]);
        }

        float averageSalary = sumAllSalary / salaryArray.length;

        System.out.println(String.format(Locale.US, "%.2f", averageSalary));
    }
}

/*
Вхідні дані
Заробітні плати працівників (не обов’язково в одному рядку)!!! - В моєму розвязку з/п в одному рядку.

Вихідні дані
Середня зарплата на підприємстві в гривнах з точністю 2 знаки після десяткової крапки.
*/