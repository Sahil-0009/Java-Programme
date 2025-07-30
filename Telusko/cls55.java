class A /* extends Object */ {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in A with int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("in B");
    }

    public B(int n) {
        this();
        System.out.println("in B with int");
    }
}

public class cls55 {
    public static void main(String[] args) {
        B obj = new B(3);
    }
}
