/*
Да се състави програма, чрез която се въвеждат 2 естествени
числа N, M от интервала [10..5555].
Програмата, чрез цикъл for, да извежда всички числа от
интервала, които са кратни на 50 в низходящ ред.
Пример: 25,249
Изход: 200,150,100, 50.
 */

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете цяло положително число N [10..5555]:");
        int n = scanner.nextInt();
        System.out.println("Моля, въведете цяло положително число M [10..5555]:");
        int m = scanner.nextInt();
        int min = 0;
        int max = 0;

        if (n > m) {
            max = n;
            min = m;
        } else {
            max = m;
            min = n;
        }

        for (int i = max; i >= min; i--) {
            if (i % 50 == 0) {
                //трябва да махна последната запетая!
                System.out.print(i + ", ");
            }
        }
    }
}
