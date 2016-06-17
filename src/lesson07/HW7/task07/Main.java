/* Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму чисел от 1 до n;
*/
package lesson07.HW7.task07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scan.nextInt();
        int sum;
        sum = n * (n + 1) / 2;

        System.out.println("Сумма всех чисел до " + n + " равна " + sum);
    }
}