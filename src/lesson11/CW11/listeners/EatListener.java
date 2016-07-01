package lesson11.CW11.listeners;

import lesson11.CW11.TamagochiListener;

public class EatListener implements TamagochiListener {
    @Override
    public void doEvent() {
        System.out.println("need eat");
    }
}
