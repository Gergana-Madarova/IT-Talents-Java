/*
Да се състави програма, чрез която се въвеждат 7 цели числа в
едномерен масив.
Програмата да изведе числото, което е най-близко до средната
стойност на въведените числа.
Пример: 1,2,3,4,5,6,7
Изход: средна стойност 4, най-близка стойност 4
 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете 7 цели числа:");
        int[] array = new int[7];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum +=array[i];
        }

        double average = 1.0 * sum / array.length;
        double diff = Double.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            double diffNew = Math.abs(array[i] - average);
            //System.out.println(diffNew);

            if (diffNew < diff) {
                diff = diffNew;
                index = i;
            }
        }

        System.out.println("Средна стойност " + average + ", най-близка стойност " + array[index]);
    }
}
