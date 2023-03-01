/*
: Въведете 3 променливи от клавиатурата – час (целочислен тип), сума пари
(число с плаваща запетая), дали съм здрав – булев тип. Съставете програма, която
взема решения на базата на тези данни по следния начин:
– ако съм болен, няма да излизам
– ако съм здрав, ще отида на кино с приятели
– ако имам пари, ще си купя лекарства
– ако нямам – ще стоя вкъщи и ще пия чай
– ако имам по-малко от 10 лв, ще отида на кафе.
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете час:");
        int hour = scanner.nextInt();

        if (hour < 0 || hour > 24) {
            System.out.println("Въведеният час е невалиден!");
        }

        System.out.println("Въведете сума пари:");
        double money = scanner.nextDouble();

        if (money < 0) {
            System.out.println("Въведената сума пари не може да бъде отрицателно число!");
        }

        System.out.println("Здрав ли съм? (true/false)");
        boolean isHealth = scanner.nextBoolean();

        if (isHealth) {
            if (money < 10 && money > 0) {
                System.out.println("Ще отида на кафе.");
            } else if (money >= 10) {
                System.out.println("Ще отида на кино с приятели.");
            }
        } else {
            System.out.println("Болен съм. Няма да излизам.");
            if (money > 0) {
                System.out.println("Ще си купя лекарства.");
            } else if (money == 0) {
                System.out.println("Ще стоя в къщи и щe пия чай.");
            }
        }
    }
}
