package lesson05.CW5;

public class Tiger extends Predator {

    @Override
    public void say() {
        System.out.println("Lol =)");
    }

    @Override
    public void seeHuman() {
        super.seeHuman();
        System.out.println("Я тигр ухахаха!");
    }
}
