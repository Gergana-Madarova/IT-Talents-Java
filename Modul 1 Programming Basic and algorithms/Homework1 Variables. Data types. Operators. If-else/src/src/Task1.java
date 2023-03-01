/*  Да се изведат съобщения към потребителя и да се
прочетат 2 числа от клавиатурата A и B (може да са с плаваща
запетая – double). После да се прочете 3-то число C и да се
провери дали то е м/у A и B. Да се изведе подходящо съобщение
за това дали C е между A и B.
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете А:");
        double a = scanner.nextDouble();
        System.out.println("Въведете B:");
        double b = scanner.nextDouble();
        System.out.println("Въведете C:");
        double c = scanner.nextDouble();

        if ((c > a && c < b) || (c < a && c > b)) {
            System.out.println("Числото " + c + " е между " + a + " и " + b);
        } else {
            if (a == b && a == c) {
                System.out.println("Числото " + c + " е равно на " + a + " и " + b);
            } else {
                System.out.println("Числото " + c + " не е между " + a + " и " + b);
            }
        }
    }
}
