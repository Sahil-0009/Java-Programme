class Test {
    public static int i = 0;

    Test() {
        i++;
    }

    public static int get() {
        return i;
    }

    public int m1() {
        System.out.println("Inside the method m1");
        this.m2();
        return 1;
    }

    public int m2() {
        System.out.println("Inside the method m2");
        return 2;
    }

}

public class MethCall {
    public static void main(String[] args) {
        Test obj = new Test();

        // Calling m1 method
        int i = obj.m1();
        System.out.println("Control returned after m1: " + i);

        // Get and print the number of objects created
        int o = Test.get();
        System.out.println("No of instances created: " + o);
    }
}
