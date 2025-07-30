
abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Play music");
    }
}

abstract class WagonR extends Car {
    public void fly() {
        System.out.println("Fly..");
    }

    public void drive() {
        System.out.println("Driving....");
    }
}

class UpdateWagonR extends WagonR {
    public void fly() {
        System.out.println("Flying..");
    }

}

public class cls63 {
    public static void main(String[] args) {
        Car obj = new UpdateWagonR();
        obj.drive();
        obj.playMusic();

    }
}
