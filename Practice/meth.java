public class meth {
    public int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        meth m = new meth();
        int res = m.max(12, 10);
        System.out.println(res);
    }
}
