package OOPS.Inheritance;

interface one {
    public void printG();
}
interface two {
    public void printF();
}
interface three extends one, two {
    public void printG();
}

class Child implements three{
    @Override public void printG(){
        System.out.println("Geeks");
    }

    @Override public void printF() {
        System.out.println("for");
    }
}

public class MultipleInherit {
    public static void main(String[] args) {
        Child c = new Child();
        c.printG();
        c.printF();
        c.printG();
    }
}
