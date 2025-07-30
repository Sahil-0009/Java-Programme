class A {
    public void show() {
        System.out.println("In show");
    }

    public void config() {
        System.out.println("In A config");
    }
}

class B extends A {
    public void show() {
        System.out.println("In show1");
    }
}

public class cls56 {
    public static void main(String[] args) {
        B a = new B();
        a.show();
        a.config();
    }
}
