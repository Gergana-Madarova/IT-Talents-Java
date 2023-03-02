/*
: Да се състави програма, която по въведено
естествено число N от интервала [10..200] извежда в обратен
ред всички числа, които са кратни на 7 и са по-малки от N.
 */

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете цяло положително число num [10 ..200]:");
        int num = scanner.nextInt();

        for (int i = num; i > 6; i--) {
            if (i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}
