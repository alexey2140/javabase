package lesson09.CW9.fuckinpackage.entity;


import lesson09.CW9.fuckinpackage.entity.human.Person;

public class Cat<P extends Person> extends Predator<P> {
    private String name;
    private int old;
    private boolean haveHuman;

    public Cat(String name, int old, boolean haveHuman) {
        this.name = name;
        this.old = old;
        this.haveHuman = haveHuman;
    }

    @Override
    public void say() {
        System.out.println("MAY");
    }

    @Override
    public void seeHuman() {
        System.out.println("kapez tapcam");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public boolean isHaveHuman() {
        return haveHuman;
    }

    public void setHaveHuman(boolean haveHuman) {
        this.haveHuman = haveHuman;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", haveHuman=" + haveHuman +
                '}';
    }
}
