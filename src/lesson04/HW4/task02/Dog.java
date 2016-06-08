/* Создать класс Dog, который будет содержать 2 поля name и says.
В main( ) создать 2 экземпляра класса с name “spot” (says, “Ruff!”) и “scruffy” (says, “Wurf!”).
И распечатать поля объектов.
*/
package HW4.task02;

public class Dog {
    String name;
    String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ", says='" + says + '\'' + '}';
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("spot", "Ruff!");
        Dog dog2 = new Dog("scruffy", "Wurf!");

        System.out.println(dog1);
        System.out.println(dog2);
    }
}