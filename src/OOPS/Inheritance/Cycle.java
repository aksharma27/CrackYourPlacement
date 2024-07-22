package OOPS.Inheritance;

public class Cycle {
    public static void main(String[] args) {
        Mtb mtb = new Mtb(2,3,19);
        System.out.println(mtb.toStr());
    }
}

class Cyc {
    int gear;
    int speed;
    public Cyc(){

    }
    public Cyc (int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBreak (int decrement) {
        speed -= decrement;
    }
    public void speedUp (int increment) {
        speed += increment;
    }
    public String toStr() {
        return "Number of gears : " + gear + "\n speed of Cycle : " + speed;
    }
}
class Mtb extends Cyc {
    public int seatHeight;
    public Mtb (int gear, int speed, int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }
    public void setHeight (int val) {
        seatHeight = val;
    }
    @Override public String toStr() {
        return (super.toStr() + "\nSeat Height is " + seatHeight);
    }
}
