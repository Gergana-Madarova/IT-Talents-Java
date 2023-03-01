/*
 Въведете 2 различни числа от конзолата и разменете
стойността им. Разпечатайте новите стойности.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете А:");
        double a = scanner.nextDouble();
        System.out.println("Въведете B:");
        double b = scanner.nextDouble();

        //Размяна на стойностите
        double c = a;
        a = b;
        b = c;

        System.out.println("Новата стойност на А е: " + a);
        System.out.println("Новата стойност на B е: " + b);
    }
}
