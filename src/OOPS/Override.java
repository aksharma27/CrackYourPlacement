package OOPS;

public class Override  {
    protected void msg () {
        System.out.println("hello protected java");
    }

    public static void main(String[] args) {
        Override obj = new A();
        obj.msg();
    }




}

class A extends Override{
    protected void msg() {
        System.out.println("hello java");
    }
}



