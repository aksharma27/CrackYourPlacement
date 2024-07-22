package OOPS.Inheritance;
class One {
    public void printGf() {
        System.out.println("Geeks");
    }
}
class Two extends One {
    public void printF(){
        System.out.println(" For ");
    }
}
class Three extends Two{
    public void  printG() {
        System.out.println("Geeks Hi");
    }
}
public class MultiLevelInherit {


    public static void main(String[] args) {
//            One obj = new Th?ree();
    Three obj = new Three();
    obj.printG();
    obj.printF();
    obj.printG();
    obj.printGf();

}
}
