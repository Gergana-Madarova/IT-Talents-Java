/*
Да се състави програма, чрез която по предварително въведени 7
числа в едномерен масив се разменят местата на елементи с индекси:
- 0 и 1 чрез трета променлива;
- 2 и 3 чрез събиране;
- 4 и 5 чрез умножение.
Пример: 1,2,3,4,5,6,7
Изход: 2,1,4,3,6,5,7
 */

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете 7 цели числа:");
        int[] array = new int[7];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        //размяна на местата на елементите:
        // 0 и 1 чрез трета променлива;
        int num = array[0];
        array[0] = array[1];
        array[1] = num;

        //2 и 3 чрез събиране
        array[2] += array[3];
        array[3] = array[2] - array[3];
        array[2] = array[2] - array[3];

        //4 и 5 чрез умножение
        array[4] *= array[5];
        array[5] = array[4] / array[5];
        array[4] = array[4] / array[5];

        //Отпечатване на резултата
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
