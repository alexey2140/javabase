package lesson05.CW5;

public class Cat extends Predator {
    private String name;
    private int old;
    private  boolean haveHuman;

    public void setName(String name) {
        this.name = name;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public void setHaveHuman(boolean haveHuman) {
        this.haveHuman = haveHuman;
    }

    public String getName() {

        return name;
    }

    public int getOld() {
        return old;
    }

    public boolean isHaveHuman() {
        return haveHuman;
    }

    public Cat(String name, int old, boolean haveHuman) {

        this.name = name;
        this.old = old;
        this.haveHuman = haveHuman;
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }

    @Override
    public void seeHuman() {
        System.out.println("Kapez tapkam");
    }
}
