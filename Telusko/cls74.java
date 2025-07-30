@FunctionalInterface
interface A {
    void show(int i);
}

// class B implements A {
// @Override
// public void show() {
// System.out.println("Hello");
// }
// }

public class cls74 {
    public static void main(String[] args) {
        // A b = () -> {
        // System.out.println("Hello");
        // };

        A obj = (int i) -> {
            System.out.println("Hello " + i);
        };

        obj.show(5);
    }
}