/*
 Въведете число от клавиатурата и определете дали е просто.
 Просто число е това което се дели САМО на 1 и на себе си.
 */


import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете цяло положително число A:");
        int a = scanner.nextInt();
        boolean isPrime = true;

        if (a > 3) {
            //оптимизация - проверяваме не до числото,а до корен квадратен от числото (+ корен квадратен)!
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(a + " е просто число");
        } else {
            System.out.println(a + " не е просто число");
        }
    }
}
