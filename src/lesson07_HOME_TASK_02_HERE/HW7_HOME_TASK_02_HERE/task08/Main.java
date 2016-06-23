/* Подсчитайте, сколько раз потребуется повторно вычислить четвёртый элемент последовательности Фибоначчи для
вычисления пятнадцатого элемента.
*/
package lesson07_HOME_TASK_02_HERE.HW7_HOME_TASK_02_HERE.task08;

public class Main {
    private static int count;

    public static void main(String[] args) {


        int a = 0, b = 1, c, fib;
        c = 15;

        for (int i = 0; i < c; i++) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(fib + " ");
            if (i == 3) {
                count++;
            }
        }
        System.out.println("");
        System.out.println("Четвертый элемент последовательности Фибоначчи был вычислен " + count + " раз");
        System.out.println("ЗАДАЧА НЕ ЯСНА!!111");

    }
}