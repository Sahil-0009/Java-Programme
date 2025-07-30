public class key {
    // void avg(int x, int y) {
    // double res = (x + y) / 2.0;
    // System.out.println(res);
    // }
    void check(double v) {
        if (v > 0 && v < 7) {
            return;
        }
        v++;
    }

    public static void main(String[] args) {
        new key().check(10);
        System.out.println("Executed");
    }

}
