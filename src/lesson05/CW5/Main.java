package lesson05.CW5;

public class Main {
    public static void main(String[] args) {
        Cat someCat0 = new Cat("Barsik", 5, true);
        Dog someDog0 = new Dog ("Sharik", 2, false);
        Tiger tiger = new Tiger();
        System.out.println("/////CAT TEST/////");
        someCat0.say();
        someCat0.seeHuman();
        System.out.println("/////DOG TEST//////");
        someDog0.say();
        someCat0.seeHuman();
        System.out.println("TIGER TEST");
        tiger.say();
        tiger.seeHuman();
    }
}
