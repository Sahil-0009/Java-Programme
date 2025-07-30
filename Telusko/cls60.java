
// class Computer{

// }
// class Laptop extends Computer{

// }

class A {
    public void show() {
        System.out.println("Inside A");
    }

}

class B extends A {
    public void show() {
        System.out.println("Inside B");
    }
}

class C extends A {
    public void show() {
        System.out.println("Inside C");
    }
}

public class cls60 {

    public static void main(String[] args) {
        A b = new B();
        b.show();

        b = new A();
        b.show();

        b = new C();
        b.show();

    }
}
