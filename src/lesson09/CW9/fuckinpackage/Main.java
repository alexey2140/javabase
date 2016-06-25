package lesson09.CW9.fuckinpackage;

import lesson09.CW9.fuckinpackage.entity.Animal;
import lesson09.CW9.fuckinpackage.entity.Cat;
import lesson09.CW9.fuckinpackage.entity.Dog;
import lesson09.CW9.fuckinpackage.entity.Tiger;
import lesson09.CW9.fuckinpackage.entity.human.Woman;

public class Main {


    public static void main(String[] args) {
        Animal someCat0 = new Cat("Matroskin", 5, false);
        Dog<Woman> someDog0 = new Dog<>("Sharik", 2, false,new Woman());
       // someDog0.setMyPerson(new Man());
        Tiger tiger = new Tiger();
        Animal someAnimal = new Animal() {
            @Override
            public void seeHuman() {
                System.out.println("I'm stupid");
            }

            @Override
            public void say() {
                System.out.println("Shalom");
            }
        };
        someAnimal.say();
        someAnimal.seeHuman();


    }
}
