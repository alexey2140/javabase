package lesson09.CW9.fuckinpackage.entity;


import lesson09.CW9.fuckinpackage.entity.human.Person;

public abstract class Predator<P extends Person> implements Animal<P> {
    @Override
        public void seeHuman() {
        System.out.println("Om-nom-nom");
    }
}
