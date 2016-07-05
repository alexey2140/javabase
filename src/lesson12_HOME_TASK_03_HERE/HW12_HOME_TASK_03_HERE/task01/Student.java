package lesson12_HOME_TASK_03_HERE.HW12_HOME_TASK_03_HERE.task01;

public class Student extends Person {
    private String idNumber;
    private double gpa;

    @Override
    public String toString() {
        return "Student{" +
                "idNumber='" + idNumber + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
