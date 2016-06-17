/* Создать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
Если таких строк несколько, то вывести индекс первой встретившейся из них.
*/
package lesson07.HW7.task06;

public class Main {
    public static void main(String[] args) {
        int[][] a = new int[7][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = (int) (Math.random() * 11) - 5;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" Строка: " + (i + 1) + " |");
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + "_" + a[i][j] + "_");
            }
            System.out.println("");
        }
    }
}