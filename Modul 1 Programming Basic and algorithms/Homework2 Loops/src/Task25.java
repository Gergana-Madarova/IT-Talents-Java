/*
Да се направи програма, която по дадено число N, да изчислява
N!, т.е. 1*2*3*4...*N.
Пример: 5
Изход: 120
Използвайте цикъл do-while.
 */

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете цяло положително число N:");
        int n = scanner.nextInt();
        int i = 1;
        int result = 1;

        do {
            result *= i;
            i++;
        } while (i <= n);

        System.out.println(result);
    }
}
