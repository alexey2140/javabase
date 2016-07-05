package lesson12_HOME_TASK_03_HERE.HW12_HOME_TASK_03_HERE.task01;

public class Person {
    private String name;
    private int age;
    private String gender;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}