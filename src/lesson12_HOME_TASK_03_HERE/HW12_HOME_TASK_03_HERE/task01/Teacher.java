package lesson12_HOME_TASK_03_HERE.HW12_HOME_TASK_03_HERE.task01;

public class Teacher extends Person {
    private double salary;
    private String subject;

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", subject='" + subject + '\'' +
                '}';
    }
}
