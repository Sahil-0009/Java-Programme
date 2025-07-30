class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Demo {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int Result = obj.add(10, 11);
        System.out.println("Result is: " + Result);
    }
}
