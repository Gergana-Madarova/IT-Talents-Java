/*
 Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите им
така, че а1 да има стойността на а2, а2 да има стойността на а3, а а3 да има старата
стойност на а1.
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете a1:");
        double a1 = scanner.nextDouble();
        System.out.println("Въведете a2:");
        double a2 = scanner.nextDouble();
        System.out.println("Въведете a3:");
        double a3 = scanner.nextDouble();

        //Размяна на стойностите
        double c = a1;
        a1 = a2;
        a2 = a3;
        a3 = c;

        System.out.println("Новата стойност на a1 е: " + a1);
        System.out.println("Новата стойност на a2 е: " + a2);
        System.out.println("Новата стойност на a3 е: " + a3);
    }
}
