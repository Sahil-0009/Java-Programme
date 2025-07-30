public class stc {

    static int var = 10;
    private int y = 33;

    public void testFunc(int x) {
        stc.var = 20;
        y = 40;
        stc t = new stc();
        System.out.println("Greek.var " + stc.var);
        System.out.println("t.var " + var);
        System.out.println("t.y " + t.y);
        System.out.println("y " + y);
    }

    public static void main(String[] args) {
        stc t = new stc();
        t.testFunc(5);
    }
}
