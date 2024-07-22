package OOPS.Inheritance;

interface A {
    void greet();
}

interface B {
    void greet();
}

interface Children extends A, B{
    @Override void greet();
    default void startGreeting() {
        System.out.println("this is a default method with \"default\" keyword");
    }
}

class LastCihld implements Children {
    public LastCihld () {
        System.out.println("constructor");
    }

     public void greet() {
        System.out.println("Good morning sir!");
    }
}


public class MultipleInher {
    public static void main(String[] args) {
        LastCihld obj = new LastCihld();
        obj.greet();
        obj.startGreeting();
    }
}
