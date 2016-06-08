package CW4;

public class Cat {
    private String name;
    private int old;
    private boolean haveHuman;

    private Cat[] catChildren = new Cat[3];
    private int childCounter = 0;

    public Cat(String name, int old, boolean haveHuman) {
        this.name = name;
        this.old = old;
        this.haveHuman = haveHuman;
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
        if (old < 0) {
            System.out.println("O_o may?");
            System.out.println("old = " + this.old);
            return;
        }
        this.old = old;
    }

    public boolean isHaveHuman() {
        return haveHuman;
    }

    public void setHaveHuman(boolean haveHuman) {
        this.haveHuman = haveHuman;
    }

    public void addChild(Cat cat) {
        if (childCounter >= 3) return;
        catChildren[childCounter] = cat;
        childCounter++;
    }

    public void printParentTree() {
        System.out.println("name = " + name);
        for (Cat cat : catChildren) {
            if (cat == null) return;

            cat.printParentTree();
        }
    }

    public Cat[] getCatChildren() {
        return catChildren;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", haveHuman=" + haveHuman +
                '}';
    }
}