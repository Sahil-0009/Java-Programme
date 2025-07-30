
abstract class Help {
    abstract void check(String s);
}

public class MethCall1 extends Help {
    public static void main(String[] args) {
        MethCall1 obj = new MethCall1();
        obj.check("Hello");
    }

    @Override
    void check(String s) {
        System.out.println(s);

    }

}
