/*
Да се състави програма, която чете от конзолата 2
естествени двуцифрени числа a,b. Програмата да изведе в
конзолата дали последната цифра от произведението на двете
числа е четна, както и самата цифра.
– Входни данни: a,b - естествени числа от интервала [10..99].
– Пример: 15, 25
– Изход: 375, 5 нечетна
 */

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете цяло число A1: [10-99]:");
        int a1 = scanner.nextInt();
        System.out.println("Въведете цяло число A2: [10-99]:");
        int a2 = scanner.nextInt();

        if ((a1 >= 10 && a1 <= 99) && (a2 >= 10 && a2 <= 99)) {
            int product = a1 * a2;
            int lastDigit = product % 10;
            if (lastDigit % 2 == 0) {
                System.out.println(product + ", " + lastDigit + ", четна");
            } else {
                System.out.println(product + ", " + lastDigit + ", нечетна");
            }
        }
    }
}
