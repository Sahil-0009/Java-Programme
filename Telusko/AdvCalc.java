public class AdvCalc extends Calc {
    public int mul(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        AdvCalc calc = new AdvCalc();
        System.out.println(calc.mul(5, 6));
        System.out.println(calc.div(10, 2));
        System.out.println(calc.add(1, 11));
        System.out.println(calc.sub(12, 10));
    }
}
