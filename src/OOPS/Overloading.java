package OOPS;

public class Overloading {
    public static void main(String[] args) {
        cat(23);
        cat(34, 'a');
        System.out.println(cat());
    }

    static void cat(int bark) {
        System.out.println(bark);
    }

    static void cat(int bark, char meow) {
        System.out.println(bark);
        System.out.println(meow);
    }

    static int cat () {
        return 3030;
    }
}
