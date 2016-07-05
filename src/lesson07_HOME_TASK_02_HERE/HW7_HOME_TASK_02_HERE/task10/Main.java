/* Имеется три стержня, на один из которых нанизаны N колец, причем кольца отличаются размером и лежат
меньшее на большем. Требуется перенести пирамиду из N колец с одного стержня на другой за наименьшее число ходов.
За один раз разрешается переносить только одно кольцо, причём нельзя класть большее кольцо на меньшее.
*/
package lesson07_HOME_TASK_02_HERE.HW7_HOME_TASK_02_HERE.task10;

public class Main {
    public static void main(String[] args) {
        int[] rod1 = new int[5];
        int[] rod2 = new int[5];
        int[] rod3 = new int[5];

        fill(rod1);             // нанизываем 5 колец на 1й стержень
        move(rod1, rod2, 4);    // переносим кольца с 1го стержня на второй
        move(rod2, rod3, 4);    // переносим кольца с 2го стержня на третий
        print(rod3);            // выводим на экран содержимое 3го стержня
    }

    // в консоли пирамида перевернута
    public static void print(int[] a) {
        System.out.println("=================================================");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Кольцо номер: " + i + " его величина: " + a[i]);
        }
    }

    public static void move(int[] src, int[] dist, int n) {
        dist[4 - n] = src[n];
        if (n > 0) {
            move(src, dist, n - 1);
        }
    }

    public static void fill(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 5 - i;
        }
    }
}