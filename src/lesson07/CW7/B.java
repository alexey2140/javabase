package lesson07.CW7;

class B extends A {
    {System.out.print(3);}
    B(){System.out.print(4);}

    public static void main(String[] args) {
        new B();
    }
}