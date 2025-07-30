public class Calc {
    public int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        int r1 = calc.add(12, 11);
        int r2 = calc.sub(12, 10);
        System.out.println(r1 + "  " + r2);
    }
}
