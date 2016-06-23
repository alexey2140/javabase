/* Создать класс, который содержит int и char (не проинициализированные) и распечатать ихзначения.
*/
package lesson04_HOME_TASK_01_HERE.HW4_HOME_TASK_01_HERE.task01;

public class Main {
    int a;
    char c;

    public static void main(String[] args) {

        Main m = new Main();
        System.out.println("Значение поля int a = " + m.a);
        System.out.println("Значение поля char c = " + "'" + m.c + "'");
    }
}