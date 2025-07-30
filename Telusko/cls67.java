abstract class Computer {

    public abstract void code();

}

class Laptop extends Computer {
    public void code() {
        System.out.println("Code compile and run..1");
    }
}

class Desktop extends Computer {
    public void code() {
        System.out.println("Code compile and run..2");

    }
}

class Developer {
    public void devApp(Computer lap) {
        // System.out.println("config..");
        lap.code();
    }
}

public class cls67 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer navid = new Developer();
        navid.devApp(desk);

    }
}
