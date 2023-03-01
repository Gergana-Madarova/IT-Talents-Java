/*
Съставете програма, която по дадено трицифренo
число проверява дали числото се дели на всяка своя цифра.
Във въведеното число да няма цифра 0.
 */

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете цяло трицифрено число [100...999]:");
        int number = scanner.nextInt();

        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;

        if ((number % a == 0) && (number % b == 0) && (number % c == 0)) {
            System.out.println("Въведеното число се дели на всяка своя цифра.");
        } else {
            System.out.println("Въведеното число не се дели на всяка своя цифра.");
        }
    }
}
