// Въведете 2 различни числа от конзолата и ги разпечатайте в нарастващ ред.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете А:");
        double a = scanner.nextDouble();
        System.out.println("Въведете B:");
        double b = scanner.nextDouble();

        if (a > b) {
            System.out.println("Числата в нарастващ ред: " + b + ", " + a);
        } else if (a < b) {
            System.out.println("Числата в нарастващ ред: " + a + ", " + b);
        } else {
            System.out.println("Числата са равни: " + a + ", " + b);
        }
    }
}
