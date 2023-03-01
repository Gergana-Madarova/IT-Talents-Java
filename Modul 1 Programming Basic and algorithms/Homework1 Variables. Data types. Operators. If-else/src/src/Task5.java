// Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ ред.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете А:");
        double a = scanner.nextDouble();
        System.out.println("Въведете B:");
        double b = scanner.nextDouble();
        System.out.println("Въведете C:");
        double c = scanner.nextDouble();

        String output = null;

        if (a >= b && a >= c) {
            if (b > c) {
                output = "Числата в низходящ ред: " + a + ", " + b + ", " + c;
                //System.out.println("Числата в низходящ ред: " + a + ", " + b + ", " + c);
            } else {
                output = "Числата в низходящ ред: " + a + ", " + c + ", " + b;
                //System.out.println("Числата в низходящ ред: " + a + ", " + c + ", " + b);
            }
        } else if (b >= a && b >= c) {
            if (a > c) {
                output = "Числата в низходящ ред: " + b + ", " + a + ", " + c;
                //System.out.println("Числата в низходящ ред: " + b + ", " + a + ", " + c);
            } else {
                output = "Числата в низходящ ред: " + b + ", " + c + ", " + a;
                //System.out.println("Числата в низходящ ред: " + b + ", " + c + ", " + a);
            }
        } else {
            if (a > b) {
                output = "Числата в низходящ ред: " + c + ", " + a + ", " + b;
                //System.out.println("Числата в низходящ ред: " + c + ", " + a + ", " + b);
            } else {
                output = "Числата в низходящ ред: " + c + ", " + b + ", " + a;
                //System.out.println("Числата в низходящ ред: " + c + ", " + b + ", " + a);
            }
        }

        System.out.println(output);
    }
}
