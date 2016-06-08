/* Создать класс, который будет хранить в одной целочисленной переменной несколько значений меньшей длины.
Например, возраст, вес, рост и год рождения. Добавить методы получения и добавления параметров отдельно.
*/
package HW4.task08;


public class Main {
    private int age, height, weight, year, combined, mask;

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCombined(int combined) {
        this.combined = combined;
    }

    public void setMask(int mask) {
        this.mask = mask;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getYear() {
        return year;
    }

    public int getCombined() {
        return combined;
    }

    public int getMask() {
        return mask;
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.setAge(23);
        m.setHeight(185);
        m.setWeight(80);
        m.setYear(91);
        m.setCombined((m.getAge()) | (m.getHeight() << 8) | (m.getWeight() << 16) | (m.getYear() << 24));

        m.setMask(0b11111111);

        System.out.printf("Age: %d, height: %d, weight: %d, year: %d%n",

                m.getMask() & m.getCombined(),
                m.getMask() & m.getCombined() >>> 8,
                m.getMask() & m.getCombined() >>> 16,
                m.getMask() & m.getCombined() >>> 24);
    }
}