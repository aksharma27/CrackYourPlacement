package OOPS.Inheritance;

abstract class Parent {
    public Parent() {
        System.out.println("This is parent abstract class");
    }
    abstract void greet();
}

class Child2 extends Parent {
//    super();
    void greet() {
        System.out.println("Hello good morning from child");
    }

    void noneAbstractedMethod () {
        System.out.println("this is not abstracted method");
    }
}

abstract class Child3 extends Parent {
    public void th() {
        System.out.println("I am good");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.greet();
        obj.noneAbstractedMethod();
    }
}