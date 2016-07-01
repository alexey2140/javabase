package lesson11.CW11;

import lesson11.CW11.listeners.EatListener;
import lesson11.CW11.listeners.SleepListener;
import lesson11.CW11.listeners.ToiletListener;
import java.util.ArrayList;


public class Animalca implements Runnable {
    private boolean sleep = false;
    private int old = 1;
    private int hungryLevel = 3; // max 10
    private int toiletLevel = 0; // max 10
    private int sleepLevel = 5; // max 10

    private ArrayList<EatListener> eatListeners = new ArrayList<>();
    private ArrayList<SleepListener> sleepListeners = new ArrayList<>();
    private ArrayList<ToiletListener> toiletListeners = new ArrayList<>();

    public Animalca() {
        run();
    }

    public boolean isSleep() {
        return sleep;
    }

    public int getOld() {
        return old;
    }

    public int getHungryLevel() {
        return hungryLevel;
    }

    public int getToiletLevel() {
        return toiletLevel;
    }

    private int getSleepLevel() {
        return sleepLevel;
    }

    public void needEat() {
        for (TamagochiListener listener : eatListeners) {
            listener.doEvent();
        }
    }

    public void needSleep() {
        for (TamagochiListener listener : sleepListeners) {
            listener.doEvent();
        }
    }

    public void needToilet() {
        for (TamagochiListener listener : toiletListeners) {
            listener.doEvent();
        }
    }

    @Override
    public void run() {
        while (true) {
            if (sleepLevel > 10) {
                throw new RuntimeException("RIP(sleep)");
            }
            if (hungryLevel > 10) {
                throw new RuntimeException("RIP(eat)");
            }
            if (toiletLevel > 10) {
                throw new RuntimeException("RIP(toilet)");
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sleepLevel += 1;
            hungryLevel += 3;
            toiletLevel += 2;
            if (sleepLevel > 10) {
                needSleep();
            }
            if (hungryLevel > 10) {
                needEat();
            }
            if (toiletLevel > 10) {
                needToilet();
            }
        }
    }
}