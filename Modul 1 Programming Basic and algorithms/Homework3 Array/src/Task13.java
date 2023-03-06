/*
Да се състави програма, чрез която се въвежда число и се представя
като число в двоична бройна система.
Програмата, чрез масив, да изчислява последователно всички цифри
на въведеното естествено число в 2-ична бройна система.
Пример: 99
Изход: 1100011
 */

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("Моля, въведете цяло положително число!");
            number = scanner.nextInt();
        } while (number <= 0);

        int[] array = new int[32];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            int remainder = number % 2;     //остатъка от деленето
            number = number / 2;
            count++;                        //за да не извеждам незначещите нули пред числото в двоичен вид
            array[i] = remainder;
            if (number == 0) {
                break;
            }
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
