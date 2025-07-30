
class A {
    public void show1() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In A show");
    }
}

public class cls62 {
    public static void main(String[] args) {
        // double d = 4.5;
        // int i = (int) d;
        // System.out.println(i);
        // A obj = (A) new B();
        // // obj.show1();

        // B obj1 = (B) obj;
        // obj1.show2();

        int num = 7;
        Integer num1 = num; // autoboxing

        int num2 = num1.intValue();
        System.out.println(num2);
    }
}
