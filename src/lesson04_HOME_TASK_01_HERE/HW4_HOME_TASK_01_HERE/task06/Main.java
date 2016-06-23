/* В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит пользователь).
*/
package lesson04_HOME_TASK_01_HERE.HW4_HOME_TASK_01_HERE.task06;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class Main {
    public static void main(String[] args) {
        double a, b, c, s, p;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину а:");
        a = scan.nextInt();
        System.out.println("Введите длину b:");
        b = scan.nextInt();

        s = (a * b) / 2;
        System.out.println("Площадь треугольника равна: " + s);

        c = sqrt(pow(a, 2.0) + pow(b, 2.0));

        p = a + b + c;
        System.out.println("Периметр треугольника равен: " + p);
    }
}