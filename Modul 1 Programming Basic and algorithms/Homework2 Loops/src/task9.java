/*
Да се прочетат 2 числа от клавиатурата А и В.
Да се изведат всички числа от А до В на степен 2(разделени с
запетая).Ако някое число е кратно на 3, да се изведе съобщение че
числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
пропуснатите) стане по-голяма от 200, да се прекрати извеждането.
 */

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете цяло число А:");
        int a = scanner.nextInt();
        System.out.println("Моля, въведете цяло число В:");
        int b = scanner.nextInt();
        int sum = 0;

        for (int i = a; i <= b * b; i++) {
            if (i % 3 == 0) {
                System.out.print("skip 3, ");
                continue;
            }

            sum += i;
            if (sum > 200) {
                break;
            }

            System.out.print(i + ", ");
        }
    }
}
