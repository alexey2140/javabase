package lesson09.CW9.fuckinpackage.entity;

import lesson09.CW9.fuckinpackage.entity.human.Person;

public class Tiger<P extends Person> extends Predator<P> {

    @Override
    public void say() {
        System.out.println("Lol xD");
    }

    @Override
    public void seeHuman() {
        super.seeHuman();
        System.out.println("I'm tiger =^_^=");
    }
}
