package lesson12_HOME_TASK_03_HERE.HW12_HOME_TASK_03_HERE.task01;

public class CollegeStudent extends Student {
    private int year;
    private String major;

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "year=" + year +
                ", major='" + major + '\'' +
                '}';
    }
}
