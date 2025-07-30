class A {
    public A() {
        System.out.println("A");
    }

    public void show() {
        System.out.println(" in A show");
    }
}

public class Cls46 {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}
