package lesson05.CW5;

public abstract class Predator implements Animal {
    @Override
    public void seeHuman() {
        System.out.println("Omnomnom");
    }
}
