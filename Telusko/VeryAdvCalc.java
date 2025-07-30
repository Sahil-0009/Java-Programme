public class VeryAdvCalc extends AdvCalc {
    public double power(int x, int y) {
        return Math.pow(x, y);
    }

    public static void main(String[] args) {
        VeryAdvCalc calc = new VeryAdvCalc();
        System.out.println(calc.power(2, 3));
        System.out.println(calc.add(1, 3));
        System.out.println(calc.div(12, 6));
    }
}
