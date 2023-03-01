/*
Да се състави програма, която въвежда естествено
число от интервала [0..24]. Програмата да изведе съответстващо
съобщение съобразно въведения час.Периодите са:
– [18..4] - Добър вечер;
– [4..9] - Добро утро;
– [9..18] - Добър ден
– Пример: 10
– Изход: Добър ден
 */

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете час (цяло число от 0 до 24):");
        int hour = scanner.nextInt();

        if (hour >= 0 && hour <= 24) {
            if (hour <= 18 && hour > 9) {
                System.out.println("Добър ден!");
            } else if (hour > 18 || hour <= 4) {
                System.out.println("Добър вечер!");
            } else if (hour > 4 && hour <= 9) {
                System.out.println("Добро утро!");
            }
        } else {
            System.out.println("Моля, въведете коректни данни!");
        }
    }
}
