package lesson09.CW9.fuckinpackage.entity;

import lesson09.CW9.fuckinpackage.entity.human.Person;

public interface Animal<P extends Person> {
    void seeHuman();

    void say();
}
