/* Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
Вывести массив на экран.
*/
package lesson07.HW7.task05;

public class Main {
    public static void main(String[] args) {
        int[][] a = new int[8][5];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" Строка: " + (i + 1) + " |");
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + "_" + a[i][j] + "_");
            }
            System.out.println("");
        }
    }
}