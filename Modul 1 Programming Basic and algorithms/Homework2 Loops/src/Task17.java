/*
Да се състави програма, която извежда квадрат, чийто страни са
оформени със знака *, а вътрешността е запълнена със въведен
знак.
Входни данни b - дължина на страната число от интервала
[3..20], c - желан знак.
Програмата да използва цикъл for.
Пример: 4 +
Изход:
****
*++*
*++*
****
 */

import java.util.Scanner;
import java.lang.String;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете желания знак:");
        String ch = scanner.nextLine();
        char c = ch.charAt(0);
        System.out.println("Моля, въведете дължина на страната b [3..20]:");
        int b = scanner.nextInt();

        for (int row = 1; row <= b; row++) {
            for (int col = 1; col <= b; col++) {
                if (row == 1 || col == 1 || col == b || row == b){
                    System.out.print("*");
                } else {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
