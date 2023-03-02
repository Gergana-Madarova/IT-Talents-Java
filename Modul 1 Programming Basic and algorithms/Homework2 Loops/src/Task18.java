/*
Да се състави програма, чрез която се въвежда две числа от интервала [1..9].
Програмата да извежда таблицата за умножение.
Максималната стойност на множителите е определена от 2-те числа.
Пример: 2 2
Изход:
1*1= 1;
1*2= 2;
2*1= 2;
2*2= 4
 */

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете цяло положително число N [1..9]:");
        int n = scanner.nextInt();
        System.out.println("Моля, въведете цяло положително число M [1..9]:");
        int m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(i + " * " + j + " = ");
                System.out.println(i * j);
            }
        }
    }
}
