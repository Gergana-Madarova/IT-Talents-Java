/*
Да се състави програма, чрез която предварително въведени 10
реални числа от интервала се обработват по следния начин:
1. Извежда съществуващите числа.
2. Всички елементи със стойност по-малки от -0.231 се заменят със
сумата от квадрата на поредния им номер + числото 41.25, а всички
останали елементи се заменят с произведението между самия елемент
и неговият пореден номер. Поредният номер на първият елемент е 1.
3. Да се изведат елементите от началния и новообразувания масив.
Пример: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
Изход: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25
 */

public class Task16 {
    public static void main(String[] args) {

        double[] arr = {-1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4};

        //Копираме стойностите в друг масив, който в последствие да променяме,
        //за да не губим първоначалните стойности
        double[] arrCopy = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }

        //Променяме arrCopy според условието
        for (int i = 0; i < arrCopy.length; i++) {
            if (arrCopy[i] < -0.231) {
                double sum = Math.pow(i + 1, 2) + 41.25;
                arrCopy[i] = sum;
            } else {
                double multiplication = arrCopy[i] * (i + 1);
                arrCopy[i] = multiplication;
            }
        }

        //Отпечатване на резултата
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arrCopy.length; i++) {
            System.out.print(arrCopy[i] + " ");
        }
    }
}