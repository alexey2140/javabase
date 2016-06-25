package lesson09.CW9.fuckinpackage.entity;

import lesson09.CW9.fuckinpackage.entity.human.Person;

public class Dog<P extends Person> extends Predator<P> {

    private String name;
    private int old;
    private boolean haveHuman;
    private P myPerson;

    public Dog(String name, int old, boolean haveHuman, P myPerson) {
        this.name = name;
        this.old = old;
        this.haveHuman = haveHuman;
        this.myPerson = myPerson;
    }

    public P getMyPerson() {
        return myPerson;
    }

    public void setMyPerson(P myPerson) {
        this.myPerson = myPerson;
    }

    @Override
    public void say() {
        System.out.println("GAV");
    }

    @Override
    public void seeHuman() {
        System.out.println("liz liz");
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", haveHuman=" + haveHuman +
                '}';
    }
}
