/*
Едно число X е палиндром, aко се чете еднакво отпред назад и отзад напред.
Да се състави програма, която проверява дали въведено число е палиндром.
Входни данни: N - естествено число от интервала [10 .. 30000].
Пример: 17571
Изход: числото е палиндром
Използвайте цикъл do-while.
 */

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете цяло положително число N [10 .. 30000]:");
        int n = scanner.nextInt();
        int temp = n;
        int sum = 0;
        int remainder = 0;

        //353
        do {
            remainder = n % 10;             //3     5       3
            sum = (sum * 10) + remainder;   //3     35      353
            n = n / 10;                     //35    3       0
        } while (n > 0);

        if (temp == sum) {
            System.out.println("числото е полиндром");
        } else
            System.out.println("числото не е полиндром");
    }
}

