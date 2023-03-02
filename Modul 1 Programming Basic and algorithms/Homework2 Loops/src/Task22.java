/*
Да се състави програма, която извежда първите 10 най-малки числа,
които се делят на 2, 3 или на 5 и които са по-големи от
въведено естествено число.
Числата се извеждат, заедно с техния пореден номер.
Входни данни: число от интервала [1..999]
Пример: 1
Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
Използвайте цикъл while
 */

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете цяло положително число N [1..999]:");
        int n = scanner.nextInt();
        int count = 1;

        while (count < 11) {
            n++;
            if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
                System.out.println(count + ":" + n);
                count++;
            }
        }
    }
}
