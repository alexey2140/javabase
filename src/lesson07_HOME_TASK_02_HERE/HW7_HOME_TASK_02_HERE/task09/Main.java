/* Создайте код, который выводит все простые числа из интервала от 2 до n (заданного с клавиатуры).
Результат должен быть: 2,3,5,7 ...
*/
package lesson07_HOME_TASK_02_HERE.HW7_HOME_TASK_02_HERE.task09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите то число до которого нужно вывести все простые числа: ");
        int n = scan.nextInt();
        recursionCalculateWrapper(n);
    }

//    public static void notRecursionCalculate(int n) {       // метод без рекурсии для понимания
//        for (int i = 1; i <= n; i++) {
//            int count = 0;
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {                           // если нашли натуральный делитель то count++
//                    count++;
//                }
//            }
//            if (count == 2) {                               // если количество нат. делителей 2 то это простое число
//                System.out.print(" " + i);
//            }
//        }
//    }

    // захотелось сделать через 1 параметр, добавил обертку
    public static void recursionCalculateWrapper(int n2) {
        recursionCalculate(2, n2);
    }

    public static void recursionCalculate(int n, int n2) {
        int count = 0;
        for (int j = 1; j <= n; j++) {
            if (n % j == 0) {
                count++;
            }
            if (count > 2) {                        // если нат. делителей больше двух то нет смысла проверять дальше
                break;
            }
        }
        if (count == 2) {                           // если нат. делителей 2 то это простое число и мы его печатаем
            System.out.print("_" + n);
        }
        if (n <= (n2 - 1)) {                        // n2 - 1 что бы не было лишней итерации после значения n2
            recursionCalculate(n + 1, n2);
        }
    }
}
// если число больше 1
// если делится без остатка на 1
// если делится без остатка на себя
// если имеет только два натуральных делителя
// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97