/*
Използвайте цикъл do-while
Да се състави програма, която да изчисли сумата на
всички числа от 1 до въведено число N.
Пример: 5
Изход: 15
 */

import java.util.Scanner;

public class Task15ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете цяло положително число num:");
        int num = scanner.nextInt();
        int sum = 0;
        int i = 1;

        do{
            sum += i;
            i++;
        } while (i <= num);

        System.out.println(sum);
    }
}
