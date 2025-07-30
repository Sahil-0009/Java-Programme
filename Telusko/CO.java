class calculator {
    public int calculate(int a, int b) {
        return a + b;
    }
}

public class CO {

    public static void main(String[] args) {
        calculator co = new calculator();
        int result = co.calculate(10, 20);
        System.out.println(result);
    }
}
