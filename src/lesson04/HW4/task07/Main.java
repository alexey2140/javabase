/* В три переменные a, b и c записаны три вещественных числа. Создать программу,
которая будет находить и выводить на экран вещественные корни квадратного уравнения ax^2 + bx + c = 0,
либо сообщать, что корней нет (a, b и c – вводит пользователь).
*/
package lesson04.HW4.task07;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        double a, b, c, x;

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите a:");
        a = scan.nextInt();
        System.out.println("Введите b:");
        b = scan.nextInt();
        System.out.println("Введите c:");
        c = scan.nextInt();

        x = (-b + sqrt(pow(b, 2.0) - 4 * a * c)) / 2 * a; // В формуле после -b идет +- и далее...., я поставил просто +
        System.out.println("В результате X равен: " + x); // не уверен что так можно, но работает)))
    }
}